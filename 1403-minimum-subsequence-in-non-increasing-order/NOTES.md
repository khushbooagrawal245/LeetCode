class Solution {
public List<Integer> minSubsequence(int[] nums) {
int sum=0;
for(int i:nums){
sum+=i;
}
int min=0;
Arrays.sort(nums);
List<Integer>list=new ArrayList<>();
for(int i=nums.length-1;i>=0;i--){
if(sum<min){
return list;
}
sum-=nums[i];
min+=nums[i];
list.add(nums[i]);
}
return list;
}
}