class Solution {
    public int findMinFibonacciNumbers(int k) {
        int ans =0;
        while(k>0){
            int prev = 1;
            int prev2 = 1;
            while(prev2 <= k){
                int temp = prev+prev2;
                prev = prev2;
                prev2 = temp;
            }
            k-=prev;
            ans++;
        }
        return ans;
    }
}