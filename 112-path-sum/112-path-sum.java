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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return check(root,0,targetSum);
    }
    public boolean check(TreeNode root,int sum,int target){
        if(root.left==null && root.right==null){
            if(sum+root.val==target){
                return true;
            }
            return false;
        }
        if(root.left!=null){
            if(check(root.left,sum+root.val,target)==true){
                return true;
            }
        }
        if(root.right!=null){
            if(check(root.right,sum+root.val,target)==true){
                return true;
            }
        }
        return false;
    }
}