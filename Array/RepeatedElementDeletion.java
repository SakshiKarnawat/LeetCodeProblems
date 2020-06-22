package Array; /**
 * Main Idea: The idea is to just maintain a length of non-repeated numbers as well as only append them at the
 * beginning of the array. Then copy them with the obtained length.
 *
 * Time Complexity:O(2n)
 */

import java.util.Arrays;

public class RepeatedElementDeletion {

    public static int[] removeDuplicates(int[] nums) {
        int length = 1 ;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1])
                nums[length++] = nums[i];
        }
        nums = Arrays.copyOf(nums,length);

        return nums;

    }

}
