package Array;

/**
 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeElement(nums, val);
 *
 * // using the length returned by the function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 *
 * Time Complexity : O(n)
 *
 */

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int length = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != val) {
                nums[length++] = i;
            }

        }

        return length;
    }



}
