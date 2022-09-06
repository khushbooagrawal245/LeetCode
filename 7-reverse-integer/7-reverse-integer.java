class Solution {
    public int reverse(int x) {
    
        int n = Math.abs(x);
        int no = 0;
        while(n>0){
            int res = n%10;
             if (no > Integer.MAX_VALUE/10 || (no == Integer.MAX_VALUE / 10 && res > 7)) return 0;
            if (no < Integer.MIN_VALUE/10 || (no == Integer.MIN_VALUE / 10 && res < -8)) return 0;
            no = res + no*10;
            n=n/10;
        }
        if(x<0)
            return -no;
        return no;
    }
}