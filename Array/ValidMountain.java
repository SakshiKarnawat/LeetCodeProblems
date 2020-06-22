package Array;

/**
 * Main Idea: The valid mountain is where there is increasing slope till an element and after that there is a decreasing
 * slope, so we need to find the biggest element in the array. To the left of this element check if there is an increasing
 * slope and to right check if there is a decreasing slope. If true, then it is a valid mountain. Also for the base case,
 * length of the mountain should atleast be three.
 *
 *
 * Time Complexity: O(3n)
 *
 * Second Solution: In this to iterate until the mountain is increasing keep incrementing an index. Then you check that
 * index is neither first or last index. Then you go on from that index and check if the mountain is decreasing and keep
 * incrementing the index. Finally you check if the index you calcullated is the last index or not. If yes, then it is a
 * valid mountain else not.
 *
 * Time Complexity: O(n)
 */

public class ValidMountain {

    public static boolean validMountainArray(int[] A) {
        boolean inc = false;
        boolean dec = false;

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        if(A.length < 3){
            return false;
        }
        for(int i =0 ;i < A.length; i++){
            if(A[i] > max){

                max = A[i];
                maxIndex = i;

            }
        }
        for(int i =0 ;i < maxIndex; i++){
            if(A[i] < A[i+1])
                inc = true;
            else
                return false;
        }

        for(int i = maxIndex ;i < A.length-1; i++){
            if(A[i] > A[i+1])
                dec = true;
            else
                return false;

        }
        if(dec && inc){
            return true;
        }
        return false;

    }

    public static boolean validMountainArraySolution(int[] A) {

        if(A.length < 3)
            return false;

        int i = 0, j = A.length;
        while(i + 1 < j && A[i] < A[i + 1])
            i++;

        if(i == 0 || i == j - 1)
            return false;

        while(i + 1 < j && A[i] > A[i + 1])
            i++;

        return i == j - 1;
    }

}
