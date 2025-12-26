public class RemoveGivenElements{
    public int removeElement(int[] nums, int val) {
        int k=0;
        int[]arr=new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}