package Array;

/**
 *
 * Main Idea: Maintain a count and a max until that index. If encounterd a zero, reset the count to zero. Return max
 * which is max number of ones seen in the array consecutively.
 *
 * Time Complexity: O(N)
 *
 */
public class ConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for(int i: nums){
            if(i == 1){
                count++;
                max = Math.max(max, count);
            }
            else
                count = 0;
        }
        return max;
    }


}
