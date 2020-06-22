package Array; /**
 * Main Idea: Take m and n and makes them indexes by subtracting 1 then take an overall index m + n + 1. Check if either
 * m > = 0 or n>=0 and if m < 0 then just append second array in 1 else if n < 0  then break, else if element in array1
 * is greater than element in array2 then append the element in the first array at the index and keep decrementing all
 * indexes.
 *
 */

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;
        int index2 = 0;

        for(int i = index ; i< nums1.length; i++){
            if(index2 < n){
                nums1[i] = nums2[index2];
                index2++;
            }
        }
        Arrays.sort(nums1);

    }
    public static void mergeTwoPointerApproach(int[] nums1, int m, int[] nums2, int n) {

        m -=1;
        n -=1;
        int index = m + n + 1;
        while(m>=0 || n>=0){
            if(m<0){
                nums1[index--] = nums2[n--];
            }else if(n < 0){
                break;
            }
            else{
                if(nums1[m]  > nums2[n]){
                    nums1[index--] = nums1[m--];
                }else{
                    nums1[index--] = nums2[n--];
                }
            }
        }


    }

}
