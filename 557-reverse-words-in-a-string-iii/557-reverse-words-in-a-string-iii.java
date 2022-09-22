class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String ans="";
        int i=0;
        for(String p:str){
            StringBuilder mutable = new StringBuilder();
            mutable.append(p);
            ans+=mutable.reverse();
            i++;
            if(i!=str.length)
            ans+=" ";
        }
        return ans;
    }
}