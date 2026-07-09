// Last updated: 7/9/2026, 10:06:23 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int l =1;
        for(int r=1;r<nums.length;r++){
            if(nums[r] != nums[r-1]){
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
}