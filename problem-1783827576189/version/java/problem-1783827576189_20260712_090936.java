// Last updated: 7/12/2026, 9:09:36 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        return toSeconds(endTime) - toSeconds(startTime);
4    }
5    private int toSeconds(String t){
6        int h = Integer.parseInt(t.substring(0,2));
7        int m = Integer.parseInt(t.substring(3,5));
8        int s = Integer.parseInt(t.substring(6,8));
9        return h * 3600 + m* 60 +s;
10    }
11}