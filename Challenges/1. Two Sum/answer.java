// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int twoSums = 0;
        int[] sumIndex = new int[2];
        int len = nums.length;
        
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++ ){
                if((nums[i] + nums[j]) == target) {
                    sumIndex[0] = i;
                    sumIndex[1] = j;
                    break;
                }
            }
        }
        return sumIndex;
    }
}