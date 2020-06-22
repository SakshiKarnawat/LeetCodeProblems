package Array; /**
 * Main Idea: Copy the array into a new array. Sort that array and compare the elements.
 *
 * Time Complexity: O(nlogn)
 *
 */

import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {

        int count = 0;
        int [] properHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(properHeights);

        for(int i = 0; i < heights.length; i++){
            if(properHeights[i] != heights[i]){
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args) {

        int [] sol = {1,1,4,2,1,3};
        int ans = heightChecker(sol);
        System.out.println(ans);
    }
}
