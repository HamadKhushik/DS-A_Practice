/* Given numbers from 0 to n, find the number that occurs most often(Frequent)
Brute Force solution
*/

import java.util.*;

public class MostFrequentNumber{
    
    public int mostFrequent(ArrayList<Integer> list){
        
        if (list.size() == 0){
            System.out.println("list is empty ");
            return 0;
        }
        else if (list.size() < 2){
            return list.get(0);
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < list.size(); i++){
            if (map.containsKey(list.get(i))){
                int value = map.get(list.get(i));
                value++;
                map.put(list.get(i), value);
            }
            else {
                map.put(list.get(i), 1);
            }
        }
        
        int maxKey = list.get(0);
        int maxValue = 0;
        
        for (int i : map.keySet()){
            if (map.get(maxKey) < map.get(i)){
                maxKey = i;
            }
        }
        return maxKey;
    }
    
    public static void main(String[] args){
        
        MostFrequentNumber object1 = new MostFrequentNumber();
        ArrayList<Integer> list = new ArrayList<Integer>((Arrays.asList(1,1,1,90, 600)));
        int max = object1.mostFrequent(list);
        System.out.println("The most frequent number in the list " + list + "is: ");
        System.out.print(max);
    }
}