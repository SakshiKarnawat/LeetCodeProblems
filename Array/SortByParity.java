package Array; /**
 * Main Idea: Use a deque to add even elements at the first and odd at the last. Then iterate the array and pop
 * elements of the deque to store at each index in the right order.
 *
 * Time Complexity: O(2n)
 *
 * Second Idea: The idea is to use two pointers. Compare the elements at two positions, if even then switch with odd at
 * the beginning to get all even numbers at the start and odd at the end.
 *
 * Time Complexity: O(n)
 */

import java.util.Deque;
import java.util.LinkedList;

public class SortByParity {

    public static int[] sortArrayByParity(int[] A) {

        Deque<Integer> s = new LinkedList<>();

        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                s.addFirst(A[i]);
            }else{
                s.addLast(A[i]);
            }
        }

        for(int i = 0; i < A.length; i++){
            A[i] = s.pop();
        }
        return A;
    }

    public static int[] sortArrayByParity2(int[] A) {

        int counter = 0;
        int temp;

        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0) {
                temp = A[counter];
                A[counter++] = A[i];
                A[i] = temp;
            }
        }


        return A;
    }

}
