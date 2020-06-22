package Array; /**
 * Main Idea: First take the square of each value of the array and obtain the resultant and then sort that array and
 * return it as result.
 *
 * Second Solution: This is a two pointer approach. We place one start at the start and one at the end. Now we check while i is
 * less than or equal to j if i is equal to j if true then in the result array we simply multiply the element at index i
 * with itself and store at index k which is set arr.length -1. If not true then we check if absolute value of i is less
 * than or equal to absolute value of j, if true then we multiply the element at index j by itself and store at index k
 * and decrement the j pointer. If not true then we multiply the value at index i by itself and increment pointer i and
 * store it in result.
 **/

import java.util.Arrays;
import java.util.Scanner;

public class SortedSquares {

    public int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);

        return A;

    }

    public int[] sortedSquares2(int[] A) {

        int i = 0, j = A.length - 1, index = A.length - 1;
        int[] result = new int[A.length];
        while (i <= j) {
            if (i == j)
                result[index] = A[i] * A[i];

            if (Math.abs(A[i]) <= Math.abs(A[j])) {
                result[index--] = A[j] * A[j];
                j--;
            } else {
                result[index--] = A[i] * A[i];
                i++;
            }
        }

        return result;

    }


}
