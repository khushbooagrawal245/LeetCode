class Solution {
    public boolean canJump(int[] nums) {
     // for(int i=0;i<nums.length-1;i++){
     //     if(nums[i]+i >= nums.length){
     //         return true;
     //     }
     // }   
     //    return false;
        
        int n = nums.length;
        if(n==1)return true;
        int max =0;
        for(int i=0;i<n-1&& max>=i;i++){
            if(max<i+nums[i]){
                max = i+nums[i];
            }
            if(max>=n-1)return true;
        }
        return false;
    }
}