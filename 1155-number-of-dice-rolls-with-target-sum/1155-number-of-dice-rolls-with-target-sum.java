class Solution {
    final int MOD = 1000000007;
    HashMap<String,Integer> map = new HashMap<>();
    public int numRollsToTarget(int d, int f, int t) {
        if(t<d || t>d*f)return 0;
        if(d==1)return t<=f?1:0;
        String key=""+d+f+t;
        if(!map.containsKey(key)){
            int sum=0;
            for(int i=1;i<=f;i++){
                sum+=numRollsToTarget(d-1,f,t-i);
                sum%=MOD;
            }
            map.put(key,sum);
        }
        return map.get(key);
    }
}