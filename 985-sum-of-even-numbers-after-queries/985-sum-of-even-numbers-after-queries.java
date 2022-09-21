class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] answer = new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
            s+=nums[i];
        }
        for(int i=0;i<queries.length;i++){
            int val = queries[i][0];
            int index = queries[i][1];
            if(nums[index]%2==0)
                s-=nums[index];
            nums[index]+=val;
            if(nums[index]%2==0)
                s+=nums[index];
            answer[i] = s;
        }
        return answer;
    }
}