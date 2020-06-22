/**
 * Main Idea: The main idea is to store both arrays in two separate sets. Then retain all elements which overlap
 * in set2 in set1. Finally put the contents of this set into an array and return this array as the output.
 *
 * Time Complexity: O(3N)
 *
 */
package HashSet;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int i : nums1) s1.add(i);

        for(int i : nums2) s2.add(i);

        s1.retainAll(s2);

        int[] result = new int[s1.size()];
        int index = 0;

        for(int i : s1) result[index++] = i;

        return result;
    }
}
