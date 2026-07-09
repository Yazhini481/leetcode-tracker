// Last updated: 7/9/2026, 10:06:15 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int index = 0;

        // Copy all non-zero elements to temp
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[index] = nums[i];
                index++;
            }
        }

        // Copy temp back to nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}