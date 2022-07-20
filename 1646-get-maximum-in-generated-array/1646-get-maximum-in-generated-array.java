class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0){
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int i,j;
        for(i=1;i<=(n-1)/2;i++){
            dp[i*2] = dp[i];
            dp[(i*2)+1] = dp[i] + dp[i+1];
        }
        int max=0;
        for(i=0;i<=n;i++){
            max = Math.max(dp[i],max);
        }
        return max;
    }
}