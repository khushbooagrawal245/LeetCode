class Solution {
    public boolean validPalindrome(String s) {
        
            int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
            return  function(s,i+1,j)||function(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
        }
    
    public  boolean function(String s,int n,int m){
       while(n<m){
           if(s.charAt(n)!=s.charAt(m)){
               return false;
           }
           n++;m--;
       }
        return true;
    }
}