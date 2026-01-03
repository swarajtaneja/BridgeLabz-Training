import java.util.*;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        // Use a TreeSet to store distinct numbers in sorted order
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.pollFirst(); // remove the smallest to keep top 3
            }
        }
        // If we have 3 elements, return the smallest (3rd max), else return the largest
        return set.size() == 3 ? set.first() : set.last();
    }
}
