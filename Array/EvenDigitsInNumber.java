package Array; /**
* Main Idea: Maintain two counters; out of which one is for overall result. Iterate the array and assign the current
* number to a variable. While that variable is not zero keep dividing it by 10 (this is how we know how many digits)
* and maintain the digit count. Finally check if that count mod 2 is zero if yes increment result counter.
* Return result.
* */
import java.util.Scanner;

public class EvenDigitsInNumber {

    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i : nums){
            int count = 0;
            int n = i;
            while(n != 0){
                n = n / 10;
                count++;
            }
            if(count % 2 == 0){
                result++;
            }
        }
        return result;
    }


}
