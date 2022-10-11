class Solution {
public boolean increasingTriplet(int[] nums) {
        if (null == nums || nums.length < 3) {
            return false;
        }
        
        int min = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= min) min = num;
            else if (num > min && num <= mid) mid = num;
            else return true;
        }
        
        return false;
    }
}