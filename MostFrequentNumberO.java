/* Given list of n numbers from 0 to 1000, find the number that occurs most often (frequently).
Optimal Solution : since the numbers in the list are bounded by 1000, we can use them to index an array where we accumulate counts.  This solution runs in O(n).
*/

package practice;

import java.util.*;

public class MostFrequentNumberO{
    
    public int findMostFrequent(ArrayList<Integer> nums, int bound){
        
        int[] counts = new int[bound];
        for (int i = 0; i < nums.size(); i++){
            counts[nums.get(i)]++;
        }
        int maxFreq = counts[0];
        int mode = 0;
        
        for (int i = 1; i < counts.length; i++){
            if (counts[i] > maxFreq){
                maxFreq = counts[i];
                mode = i;
            }
        }
        return mode;
    }
    
    public static void main(String[] args){
        
        MostFrequentNumberO object1 = new MostFrequentNumberO();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,1,90,600));
        int mostFrequent = object1.findMostFrequent(list, 1000);
        System.out.println("The most frequent number in the list " + list + "is: ");
        System.out.print(mostFrequent);
    }
}