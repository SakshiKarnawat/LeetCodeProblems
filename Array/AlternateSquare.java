package Array;

/**
 * Main Idea: This is a inplace replacement solution where you check mod 2 of index is zero and take square on
 * even index.
 *
 * Time Complexity: O(n)
 */
public class AlternateSquare {

    public static int [] alternateSquare(int [] a){
        for(int i = 0; i < a.length; i++){
            if(i % 2 == 0)
                a[i] *= a[i];
        }
        return a;
    }


}
