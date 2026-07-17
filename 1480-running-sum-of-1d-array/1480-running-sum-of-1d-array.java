class Solution {
    public int[] runningSum(int[] nums) {
         int size = nums.length;
        int ans[] =new int[size];

        int i=0;
        int sum=0;
        while (i<size) {
          sum+=nums[i];
          ans[i]=sum;
          i++;
  
        }

        return ans;
    }
}