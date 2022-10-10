class Solution {
    public String breakPalindrome(String palindrome) {
        int l = palindrome.length();
        String s= "";
        int i=0;
        int c=0;
        if(l <= 1)return "";
        for(i=0;i<l/2;i++){
            if(palindrome.charAt(i)!='a'&&c==0){
                s = s+"a";
                c++;
            }
            else{
                s+=palindrome.charAt(i);
            }
        }
        for(i=l/2;i<l-1;i++){
            s+=palindrome.charAt(i);
        }
        if(c==0)s+='b';
        else{
            s+=palindrome.charAt(l-1);
        }
        return s;
    }
}