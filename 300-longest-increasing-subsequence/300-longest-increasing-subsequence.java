class Solution {
    public int lengthOfLIS(int[] nums) {
    if(nums.length==0){
        return 0;
    }
        int c=1;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for(int i=1;i<nums.length;i++){
            int max =0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(max < dp[j]) max = dp[j];
                }
            }
            dp[i]=max+1;
            c= Math.max(c,dp[i]);
        }
        return c;
    }
}