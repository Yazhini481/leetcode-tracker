// Last updated: 7/9/2026, 10:06:16 AM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        for(int num : nums){
            int range = digitRange(num);
            maxRange = Math.max(maxRange,range);
        }
        int sum  = 0;
        for(int num: nums){
            if(digitRange(num) == maxRange){
                sum += num;
            }
        }
        return sum;
    }
    private int digitRange(int num){
        int max = 0;
        int min = 9;
        while(num>0){
            int digit = num%10;
            max = Math.max(digit,max);
            min = Math.min(digit,min);
            num /=10;
            
        }
        return max - min;
    }
}