class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length][amount+1];
         for(int row[]: dp)
    Arrays.fill(row,-1);
    return countWaysToMakeChangeUtil(coins,coins.length-1, amount, dp);
    }
    public static int countWaysToMakeChangeUtil(int[] arr,int idx,int T,int[][] dp){
        if(idx==0)
            return T%arr[0]==0?1:0;
        if(dp[idx][T] != -1)return dp[idx][T];
        int nottaken = countWaysToMakeChangeUtil(arr,idx-1, T, dp);
        int taken = 0;
        if(arr[idx]<=T){
            taken = countWaysToMakeChangeUtil(arr,idx, T-arr[idx], dp);
        }
        return dp[idx][T] = taken+nottaken;
    }
}