class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int rows[]:dp)Arrays.fill(rows,-1);
        return func(dp,grid.length-1,grid[0].length-1,grid);
    }
    public static int func(int[][] dp,int m,int n,int[][] mat){
        if(m==0 && n==0){
            return mat[0][0];
        }
        if(m<0 || n<0){
            return (int)Math.pow(10,9);
        }
        if(dp[m][n] != -1)return dp[m][n];
        int up = mat[m][n] + func(dp,m-1,n,mat);
        int left = mat[m][n] + func(dp,m,n-1,mat);
        return dp[m][n] = Math.min(left,up);
    }
}