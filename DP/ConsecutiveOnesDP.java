
package DP;

public class ConsecutiveOnesDP {

    public static int consecutiveOnesDP(int [] nums){

        int [] S = new int[nums.length];
        if(nums[0] == 0)
            S[0] = 0;
        else
            S[0] = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 1 && nums[i - 1] == 1)
                S[i] = S[i - 1] + 1;
            else if(nums[i] == 1 && nums[i - 1] != 1)
                S[i] = 1;
            else
                S[i] = 0;
        }
        int result = 0;
        for(int i: S){
            if(i > result)
                result = i;
        }
//
//        for(int i: S){
//            System.out.println(i);
//        }

        return result;
    }

    public static void main(String[] args) {

        int [] sol = {1,1,0,1,1,1,0,1,0};
        System.out.println(consecutiveOnesDP(sol));
    }
}
