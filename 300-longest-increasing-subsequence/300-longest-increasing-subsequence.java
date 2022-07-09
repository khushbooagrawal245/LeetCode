class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            int max =0; 
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(max<dp[j]){
                        
                        max = dp[j];
                    }
                }
            }
            dp[i] = max+1;
            
            ans = Math.max(ans,dp[i]);
        }
        // for(int i=0;i<dp.length;i++){
        //     System.out.print(dp[i]);
        // }
        return ans;
    }
}