class Solution {
    public List<List<Integer>> combinationSum2(int[] A, int target) {
        Arrays.sort(A);
        List<List<Integer>> res = new ArrayList<>();
        combinations(A, res, new ArrayList<>(), 0, target);
        return res;
    }
    public void combinations(int[] A, List<List<Integer>> res, List<Integer> li, int ind, int tar){
        if(tar==0){
            res.add(new ArrayList<>(li));
            return;
        }
        for(int i=ind;i<A.length;i++){
            if(i>ind && A[i]==A[i-1]){
                continue;
            }
            if(A[i]>tar){
                break;
            }
            li.add(A[i]);
            combinations(A,res,li,i+1,tar-A[i]);
            li.remove(li.size()-1);
        }
        
    }
}