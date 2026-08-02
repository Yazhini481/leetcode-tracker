// Last updated: 8/2/2026, 8:56:54 AM
1class Solution {
2    public int gcd(int a , int b){
3        while(b!=0){
4            int temp = b;
5            b = a%b;
6            a = temp;
7        }
8        return a;
9    }
10    public long maxPairStrength(int[] nums) {
11        int n = nums.length;
12        long max = 0;
13        for(int i=0;i<n-1;i++){
14            for(int j= i+1;j<n;j++){
15                int g = gcd(nums[i],nums[j]);
16                long strength = (1L * nums[i] * nums[j]) / (1L * g * g);
17                max = Math.max(max,strength);
18            }
19        }
20        return max;
21    }
22}