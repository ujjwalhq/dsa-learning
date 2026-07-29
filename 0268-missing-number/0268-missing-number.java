class Solution {
    public int missingNumber(int[] nums) {
        // brute force approach
        int len = nums.length;
        int expactSum = len * (len + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        return expactSum - actualSum;
    }
}