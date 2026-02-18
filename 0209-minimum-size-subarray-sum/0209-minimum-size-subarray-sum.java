class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int su = 0;
        int minl = Integer.MAX_VALUE;

        for(int r = 0;r < nums.length;r++){
            su += nums[r];
        

        while(su >= target){
            minl = Math.min(minl,r - l + 1);
            su -= nums[l];
            l++;
        }
    }
    return minl == Integer.MAX_VALUE ? 0: minl;
}
}