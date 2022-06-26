class Solution {
    public int minimumSum(int num) {
        int[] array = new int[4];
        int i=0;
        while(num!=0){
            array[i] = num%10;
            num = num/10;
            i=i+1;
        }
        Arrays.sort(array);
        array[0] = array[0]*10 + array[3];
        array[1] = array[1]*10 + array[2];
    return array[0]+array[1];
    }
    
}