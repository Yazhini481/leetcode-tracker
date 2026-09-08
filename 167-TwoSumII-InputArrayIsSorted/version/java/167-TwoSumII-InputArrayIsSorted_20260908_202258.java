// Last updated: 9/8/2026, 8:22:58 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int n = numbers.length;
4        int left = 0 ;
5        int right = n-1;
6        while(left<right){
7            int sum = numbers[left] + numbers[right];
8            if(sum == target){
9                return new int[]{left+1,right+1};
10            }
11            else if(sum > target){
12                right--;
13            }
14            else{
15                left++;
16            }
17        }
18        return new int[]{-1,-1};
19    }
20}