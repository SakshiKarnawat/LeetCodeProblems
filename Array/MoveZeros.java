package Array;

/**
 * Main Idea: The idea is to iterate and add non-zero elements then simply make other elements zero.
 *
 * Time Complexity: O(2n)
 *
 * Second Method: Two pointer approach replaces non-zero elements with zero and finally has an array with non-zero
 * elements at the beginning.
 *
 * Time Complexity: O(n)
 */
public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int length = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
                nums[length++] = nums[i];

        }

        for(int i = length; i < nums.length; i++){
            nums[i] = 0;

        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);

        }


    }
    public static void moveZeroesAlternate(int[] nums) {
        int temp = 0, counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = temp;
                counter++;
            }
        }
    }


}
