// Last updated: 7/9/2026, 10:06:13 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int index = nums.length - 1;
        for(int i=0;i<k;i++){
            long val = nums[index--];
            long normal = val;
            long multiply = val * 1L * mul;
            ans += Math.max(normal,multiply);
            mul--;
        }
        return ans;
    }
}