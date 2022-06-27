class Solution {
    public int balancedStringSplit(String s) {
        int count =0;
        int rep =0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='R'){
               rep += 1;
           }
            else {
                rep += -1;
            }
            if(rep == 0){
                count++;
            }
        }
        return count;
    }
}


// no of L = no of R 
// LR