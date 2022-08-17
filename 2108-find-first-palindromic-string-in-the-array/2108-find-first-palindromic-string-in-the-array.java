class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String str="";
            for(int j=words[i].length()-1;j>=0;j--){
                str += words[i].charAt(j);
            }
            if(words[i].equals(str)){
                return words[i];
                
            }
        }
        return "";
    }
}