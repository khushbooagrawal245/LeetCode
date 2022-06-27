class Solution {
    public int arrayPairSum(int[] nums) {
        int len = nums.length;
        int s=0;
        Arrays.sort(nums);
        for(int i=0;i<len;i+=2){
            s+=nums[i];
        }
        return s;
    }
}