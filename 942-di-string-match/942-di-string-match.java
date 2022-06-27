class Solution {
    public int[] diStringMatch(String s) {
       int size = s.length();
        int low = 0, high = size;
        int[] res = new int[size + 1];
        for(int i=0; i < size; i++){
            if(s.charAt(i) == 'I') res[i] = low++;
            else res[i] = high--;
        }
        res[size] = high;
        return res;
    }
}