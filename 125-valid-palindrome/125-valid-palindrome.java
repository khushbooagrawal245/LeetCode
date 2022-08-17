class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))){
                
                str+=s.charAt(i);
            }
            
               
        }
        str = str.toLowerCase();
               String fake = "";
               for(int i=str.length()-1;i>=0;i--){
                   fake+=str.charAt(i);
               }
               if(fake.equals(str))
               return true;
             return false;
    }
}