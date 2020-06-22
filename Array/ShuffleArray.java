package Array;

public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        int tempIndex = n;
        for(int i = 0 ; i < n; i++){
            result[index++] = nums[i];
            result[index++] = nums[tempIndex];
            tempIndex++;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7};
        ShuffleArray sa = new ShuffleArray();
        int[] result = sa.shuffle(nums,3);

        for(int i : result){
            System.out.println(i);
        }
    }
}
