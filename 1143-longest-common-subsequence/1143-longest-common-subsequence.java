class Solution {
public int longestCommonSubsequence(String text1, String text2) {
    int dp[][]=new int[text1.length()][text2.length()];
    for(int rows[]: dp)
    Arrays.fill(rows,-1);
    return func(text1,text2,text1.length()-1,text2.length()-1,dp);
}
    public static int func(String s1, String s2,int ind1,int ind2,int[][] dp){
        if(ind1<0 || ind2 < 0)return 0;
        if(dp[ind1][ind2]!=-1)
        return dp[ind1][ind2];
        if(s1.charAt(ind1)==s2.charAt(ind2)) 
            return dp[ind1][ind2] = 1 + func(s1,s2,ind1-1,ind2-1,dp);
        else return dp[ind1][ind2] = Math.max(func(s1,s2,ind1,ind2-1,dp),func(s1,s2,ind1-1,ind2,dp));
    }
}