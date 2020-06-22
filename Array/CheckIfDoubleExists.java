package Array; /**
 * Main Idea: Use a set to keep track of two types of numbers:
 * 1. whose remainder is zero and divide thses numbers by 2 and store it in the set.
 * 2. whose remainder is not zero, take these numbers and multiply these numbers by 2
 * Now as you iterate through the array if you find the number that already exists in the list return true,
 * else return false;
 *
 * Time Complexity: O(n)
 *
 */

import java.util.HashSet;
import java.util.Set;

public class CheckIfDoubleExists {

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> counter = new HashSet<Integer>();
        for(int i: arr) {
            if (counter.contains(i) == false) {
                if (i % 2 == 0) {
                    counter.add(i / 2);
                }
                counter.add(i * 2);
            } else {
                return true;
            }
        }
        return false;


    }


    public static boolean checkIfExistTwoPointer(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j > i; j++){
                if((arr[i] == 2 * arr[j]) || (arr[i] % 2 == 0 && arr[i]/2 == arr[j]))
                    return true;
            }
        }
        return false;


    }
}
