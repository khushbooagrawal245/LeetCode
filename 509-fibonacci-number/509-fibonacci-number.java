class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return func(dp,n);
    }
    public static int func(int[] dp,int n){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        return dp[n] = func(dp,n-1)+func(dp,n-2);
    }
}