class Solution {
    public int minOperations(int[] nums) {
        int count =0;
        for(int i=1;i<nums.length;i++){
            int k = nums[i];
            if(nums[i]<=nums[i-1]){
                nums[i] += (nums[i-1] - nums[i] + 1);
                count = count + (nums[i] - k );
            }
          //  System.out.println(nums[i-1]);
        }
        return count;
    }
}