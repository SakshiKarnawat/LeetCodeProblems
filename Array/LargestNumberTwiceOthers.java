package Array;

/**
 *  Main Idea: Find the largest element in O(n). Then in O(n) check if it twice as big as the largest element by
 *  checking if the current index not equal to index of the largest number and if the numbers are twice as big as the
 *  largest number then return -1 else return the index of the largest number.
 *
 *  Main Idea for single pass: Find the first largest and second largest number in a single pass and compare if that
 *  number if half the largest number.
 *
 *
 * */
public class LargestNumberTwiceOthers {

    public int dominantIndex(int [] nums){
        int index =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[index] < nums[i]){
                index = i;
            }
        }
        for(int i = 0; i < nums.length;i++){
            if(i != index && nums[index] < 2 * nums[i]){
                return -1;
            }
        }
        return index;
    }

    public int dominantIndexSinglePass(int [] nums){
        int a = -1,b = -1, index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > a){
                b = a;
                a = nums[i];
                index = i;
            }else if(nums[i] > b){
                b =nums[i];
            }
        }
        return a >= 2 * b ? index : -1;
    }


}
