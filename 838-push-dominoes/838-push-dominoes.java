class Solution {
    public String pushDominoes(String dominoes) {
    int len = dominoes.length();
        int f=0;
        int[] forces = new int[len];
        for(int i=0;i<len;i++){
            if(dominoes.charAt(i) == 'R') f = len;
            else if(dominoes.charAt(i) == 'L') f=0;
            else f= Math.max(f-1,0);
            forces[i]+=f;
        }
        f=0;
        for(int i=len-1;i>=0;i--){
            if(dominoes.charAt(i) == 'L') f = len;
            else if(dominoes.charAt(i) == 'R') f=0;
            else f= Math.max(f-1,0);
            forces[i]-=f;
        }
        StringBuilder str = new StringBuilder();
        for(int v:forces){
            str.append((v>0)?'R':v<0?'L':".");
        }
        return str.toString();
    }
}