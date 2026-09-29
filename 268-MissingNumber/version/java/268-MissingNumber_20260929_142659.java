// Last updated: 9/29/2026, 2:26:59 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        HashMap<Integer,Boolean> map= new HashMap<>();
5        for(int i=0;i<n;i++){
6            map.put(nums[i], true);
7        }
8        for(int i=0;i<=n;i++){
9            if(!map.containsKey(i)){
10                return i;
11            }
12        }
13        return -1;
14    }
15}