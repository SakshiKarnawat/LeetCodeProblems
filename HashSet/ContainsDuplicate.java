/**
 * Main Idea: The idea is to maintain a set of currently seen numbers. If the number repeats then return true.
 *
 * Time Complexity: O(N)
 *
 * Main Idea 2: The idea is to maintain a set of currently seen numbers. Just compare set size to array length.
 * If it is greater return true else false.
 *
 * Time Complexity: O(N)
 *  
 */
package HashSet;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int [] nums){
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            if(s.contains(i))
                return true;
            s.add(i);
        }

        return false;

    }

    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            if(!s.contains(i))
                s.add(i);
        }
        return (s.size() < nums.length);
    }

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(nums));
    }
}
