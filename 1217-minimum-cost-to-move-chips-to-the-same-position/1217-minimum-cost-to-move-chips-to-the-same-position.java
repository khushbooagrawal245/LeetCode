class Solution {
    public int minCostToMoveChips(int[] position) {
        int o=0;
        int e=0;
        for(int p:position){
            if(p%2==0)e++;
            else{
                o++;
            }
        }
        return Math.min(e,o);
    }
}