/**
 * Main Idea 1: Using XOR cancels out all repeating elements leaving the single number alone.
 *
 * Time Complexity: O(N)
 *
 * Main Idea 2: Using HashMap to store the frequency of numbers. The number with frequency of 1 is the answer.
 *
 * Time Complexity: O(2N)
 *
 * Main Idea 3: Using Mathematics to calculate the some of all elements without considering repetition and then
 * just the sum of all elements. Then we multiply the sum of non repeating elements by 2 and subtract total sum
 * to get the answer.
 *
 * Time Complexity: O(N)
 */
package HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public int singleNumberBitManupilation(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){

            result ^= nums[i];

        }

        return result;
    }


    public int singleNumberHashMap(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            m.put(nums[i], m.getOrDefault(nums[i],0) + 1);
        }
        for(int i : nums){
            if(m.get(i) == 1)
                return i;
        }
        return 0;
    }

    public int singleNumberHashSet(int[] nums){
        Set<Integer> s = new HashSet<>();
         int sumNotRepeat = 0;
         int sumAll = 0;
         for(int i : nums){
             if(!s.contains(i)){
                 s.add(i);
                 sumNotRepeat += i;
             }
             sumAll += i;
         }

         return 2 * sumNotRepeat - sumAll;
    }


    public static void main(String[] args) {

        int [] nums = {2,4,2,4,5,5,6,7,7};
        SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumberHashSet(nums));
    }
}
