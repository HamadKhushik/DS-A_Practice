/* Given a list of numbers from 0 to n, with Exactly one number removed, find the missing number
Solution: this solution runs on O(n). the solution is based on formula n*(n + 1)/2 for sum of integers from 0 to n
*/

package practice;

import java.util.*;

public class FindMissingNumber{
    
    public int findMissing(ArrayList<Integer> nums){
        
        int sums = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++){
            sums += nums.get(i);
        }
        return (n*(n+1)/2 - sums);
    }
    
    public static void main(String[] args){
        FindMissingNumber object1 = new FindMissingNumber();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0,1,2,4,5,6,7));
        int missing = object1.findMissing(list);
        System.out.println("The missing number in the list: "  + list + " is ");
        System.out.println(missing);
    }
}