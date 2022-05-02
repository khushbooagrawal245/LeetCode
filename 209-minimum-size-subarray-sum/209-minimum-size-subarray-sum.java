class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum =0;
        int win_start =0;
        for(int win_end = 0; win_end<nums.length;win_end++){
            sum += nums[win_end];
            while(sum>=target){
             min = Math.min(min, win_end - win_start + 1);
                sum -= nums[win_start];
                win_start++;
            }
        }
        
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        
        return min;
    }
}