import java.util.*;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count occurrences of each number in nums1
        for (int num : nums1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Iterate nums2 and add common elements
        for (int num : nums2) {
            if (counts.getOrDefault(num, 0) > 0) {
                result.add(num);
                counts.put(num, counts.get(num) - 1); // decrease count
            }
        }

        // Convert List<Integer> to int[]
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }

}
