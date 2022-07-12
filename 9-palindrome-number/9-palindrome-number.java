class Solution {
    public boolean isPalindrome(int x) {
        // int org = x;
        // int p = 0;
        // if(x>0){
        //     while(x!=0){
        //     int rem = x%10;
        //     p = p * 10 + rem ;
        //     x=x/10;
        // }
        // }
        // System.out.println(p);
        // if(org == p)
        //     return true;
        // return false;
        
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        int rev =0;
        while(x > rev){
            rev = rev *10 + x%10;
            x/=10;
        }
        return x == rev  || x==rev/10;
    }
}