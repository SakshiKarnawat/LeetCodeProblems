/**
 * Main Idea 1: Both ideas use a getSquareSum function which basically breaks the integer and takes square of Individual
 * digits and adds them up. In the first solution I use a HashSet, keep adding the element and adding the new n
 * calculated until I finally get value of n as 1 or find a cycle. Then I finally return true if value of n is 1.
 *
 * Time Complexity: O(logN)
 *
 * Main Idea 2: Both ideas use a getSquareSum function which basically breaks the integer and takes square of Individual
 * digits and adds them up. In the second solution I use two integers one slow and one fast slow mmoves to next n and
 * fast moves to next next n. If there is a cycle it will return false else if fast reaches 1 then it will return true.
 *
 *  Time Complexity: O(logN)
 *
 */
package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public int getSquareSum(int n){

        int sqSum = 0;
        while(n > 0){
            int temp = n % 10;
            n = n / 10;
            sqSum += temp * temp;
        }
        return sqSum;
    }

    public boolean isHappy(int n){
        Set<Integer> s = new HashSet<>();
        while(n != 1 && !s.contains(n)){

            s.add(n);
            n = getSquareSum(n);

        }

        return n == 1;
    }

    public boolean isHappySlowFastSol(int n){

        if(n == 0) return false;

        int slow = n;
        int fast = getSquareSum(n);


        while(fast != 1 && slow != fast){

            slow = getSquareSum(n);
            fast = getSquareSum(getSquareSum(n));

        }
        return fast == 1;
    }
}
