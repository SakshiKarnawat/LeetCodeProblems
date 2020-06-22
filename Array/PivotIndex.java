package Array; /**
 * Main idea : Find the global sum save it. Then check in a for loop if leftsum = sum - leftsum - current element,
 * if this is true then return the current index else update leftsum, if no such index found then return -1
 *
 *
 * Time Complexity : O(n)
 *
 **/
import java.util.Scanner;

public class PivotIndex {

    public int pivotIndex(int [] nums){
        int sum = 0;
        int leftsum = 0;

        for(int i: nums){
            sum+= i;
        }
        for(int i = 0; i < nums.length; i++){

            if(leftsum == sum -leftsum -nums[i]){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

}
