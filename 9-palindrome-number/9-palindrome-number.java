class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int p = 0;
        if(x>0){
            while(x!=0){
            int rem = x%10;
            p = p * 10 + rem ;
            x=x/10;
        }
        }
        if(org == p)
            return true;
        return false;
    }
}