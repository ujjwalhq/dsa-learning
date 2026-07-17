class Solution {
    public int[] buildArray(int[] nums) {
        int size=nums.length;
        int ans[] = new int[size];

        int i=0;
        while (i<size) {
          ans[i]=nums[nums[i]];
          i++;
        }

        return ans;
    }
}