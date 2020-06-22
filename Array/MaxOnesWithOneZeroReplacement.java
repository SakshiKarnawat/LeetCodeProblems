package Array;

public class MaxOnesWithOneZeroReplacement {

    public int findMaxConsecutiveOnesSolution(int[] nums) {

        int pointerZero = -1;
        int pointerStart = -1;
        int length = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                pointerStart = pointerZero;
                pointerZero = i;
            }
            length = Math.max(length, Math.max(pointerZero , i) - pointerStart);
        }
        return length;
    }

}
