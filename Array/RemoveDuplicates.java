package Array;

/**
 * Main Idea:  I use a two-pointer approach here. One, that would keep track of the current element in the original
 * array and another one for just the unique elements. Essentially, once an element is encountered, I simply bypass
 * its duplicates and move on to the next unique element.
 *
 * Time Complexity : O(n)
 */

public class RemoveDuplicates {

    public  static int removeDuplicates(int[] nums) {
        int length = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] != nums[i]){
                nums[length++] = nums[i];
            }
        }

        for(int i = 0; i < length ; i++){
            System.out.println(nums[i]);
        }
        return length;
    }

}
