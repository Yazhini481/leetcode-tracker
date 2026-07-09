// Last updated: 7/9/2026, 10:06:11 AM
class Solution {
    public int countDigits(int num) {
        int count = 0;
        int original = num;
        while(num>0){
            int digit = num%10;
            if(original != 0 && original%digit==0){
                count++;
            }
            num = num/10;
        }
        return count;
    }

}