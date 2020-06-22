package Array; /**
 *
 * Main Idea 1: The first idea is to look at each number as index. Iterate the array, set the current index we are looking
 * at as Math.abs(current element) - 1. If the number at this position is greater than zero then make this number
 * negative by multiplying by -1. In the end when you are done and iterate through the array only the elements at
 * missing indexes will be positive. So add to list that index + 1 as the number missing.
 *
 * Time Complexity : O(N)
 *
 * Main idea 2: The second idea is to use a Hash set to keep track of the numbers seen. Then iterate this set from
 * 1 to n to check which elements are missing and add them to the list.
 *
 * Time Complexity: O(N)
 *
 *
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisappearingNumbers {

    public List<Integer> findDisappearedNumbers1(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++){
            int counter = Math.abs(nums[i]) - 1;
            if(nums[counter] > 0){
                nums[counter] = nums[counter] * -1;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }

        return list;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
            }
        }

        for(int i = 1; i <= nums.length; i++){
            if(!s.contains(i)){
                list.add(i);
            }
        }


        return list;
    }

}
