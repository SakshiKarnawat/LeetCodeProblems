package Array;

import java.util.*;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }else if(nums.length==2){
            if(nums[0]>nums[1])
                return nums[0];
            else
                return nums[1];
        }
        else{

            for(int i=0;i<nums.length;i++){
                if(max<=nums[i]){
                    max = nums[i];
                }
            }
            for(int i=0;i<nums.length;i++){
                if(max2<=nums[i] && nums[i]!=max){
                    max2 = nums[i];
                }
            }
            for(int i=0;i<nums.length;i++){
                if(max3<=nums[i] && nums[i]!=max && nums[i]!=max2){
                    max3 = nums[i];
                }
            }
        }
        if(max3 == Integer.MIN_VALUE ){
            return  max2;
        }else if(max3 == Integer.MIN_VALUE && max2 == Integer.MIN_VALUE){
            return max;
        }else
            return max3;
    }

    public static int thirdMaxSol(int [] nums){

        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
                p.add(nums[i]);
            }
            if(p.size() > 3)
                p.poll();
        }
        if(p.size() < 3)

            if(p.size() > 1)
                p.poll();


        return p.peek();

    }

    public static int thirdMaxSol2(int [] nums) {
        Integer max1 = null, max2 = null, max3 = null;

        for (Integer x : nums) {
            if (x.equals(max1) || x.equals(max2) || x.equals(max3)) continue;
            if (max1 == null || x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (max2 == null || x > max2) {
                max3 = max2;
                max2 = x;
            } else if (max3 == null || x > max3) {
                max3 = x;
            }
        }

        return max3 == null ? max1 : max3;
    }
    public static void main(String[] args) {
        int [] sol = {2,1,3};
        System.out.println(thirdMaxSol2(sol));
    }




}

