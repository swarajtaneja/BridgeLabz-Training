public class FindPositionInArray {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};
    }

    int first(int[] nums, int target) {
        int l = 0, r = nums.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= target) r = mid - 1;
            else l = mid + 1;
            if (nums[mid] == target) res = mid;
        }
        return res;
    }

    int last(int[] nums, int target) {
        int l = 0, r = nums.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] <= target) l = mid + 1;
            else r = mid - 1;
            if (nums[mid] == target) res = mid;
        }
        return res;
    }
}
