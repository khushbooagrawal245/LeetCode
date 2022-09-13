class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        // if(tokens.length == 1){
        //     if(power>=tokens[0]){
        //         return 1;
        //     }
        //     return 0;
        // }
        Arrays.sort(tokens);
        int score =0;
        int l = 0;
        int a = 0;
        int h = tokens.length-1;
        while(l<=h){
            if(tokens[l]<=power){
                score += 1;
                if(a<score)a=score;
                power = power - tokens[l];
                l++;
            }
            else if(score > 0){
                score -= 1;
                power = power + tokens[h];
                h--;
            }
            else{
                break;
            }
        }
        return a;
    }
}
