//https://leetcode.com/problems/running-sum-of-1d-array/


class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] numsSum = new int[len];
        int sums = nums[0];
        numsSum[0] = nums[0];
        
        for(int i = 1; i < len; i++) {
            sums += nums[i];
            numsSum[i] = sums;
        }
        return numsSum;
    }
}