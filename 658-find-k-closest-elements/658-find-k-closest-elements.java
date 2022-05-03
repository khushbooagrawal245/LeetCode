class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> l = new ArrayList<Integer>();
        int low = 0;
        int right = arr.length-1;
        while(right-low >= k){
            int m = Math.abs(arr[low]-x);
            int n = Math.abs(arr[right]-x);
            if(m<=n){
                right--;
            }
            else{
                low++;
            }
        }
        while(low<=right){
            l.add(arr[low++]);
        }
        return l;
    }
}   