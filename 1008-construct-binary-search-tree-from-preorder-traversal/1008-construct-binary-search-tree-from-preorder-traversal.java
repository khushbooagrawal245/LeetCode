/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int nodeIdx;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null){
            return null;
        }
        nodeIdx =0;
        return bsthelper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
    }
    public TreeNode bsthelper(int[] nums, int start,int end){
        if(nodeIdx == nums.length || nums[nodeIdx] < start || nums[nodeIdx] > end ){
            return null;
        }
        int val = nums[nodeIdx++];
        TreeNode node = new TreeNode(val);
        node.left = bsthelper(nums,start,val);
        node.right = bsthelper(nums,val,end);
        return node;
        
    }
}