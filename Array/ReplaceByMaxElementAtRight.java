package Array;

/**
 * Main Idea: The main idea is to iterate from the last, store the last element as max, set it to -1, also keep a temp
 * variable to keep track of current element. Iterate through the elements starting from the second last element, check
 * if the max is less than temp if true set max to temp and then set current element to temp and set the current element
 * to max. This is a one pass solution.
 *
 * Time complexity: O(n)
 */

public class ReplaceByMaxElementAtRight {

    public static int[] replaceElements(int[] arr) {
        int temp = 0;
        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for(int  i = arr.length - 2; i >= 0; i--){
            if(max < temp)
                max = temp;
            temp = arr[i];
            arr[i] = max;
        }
        return arr;

    }

}
