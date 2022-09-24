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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> all = new ArrayList();
        List<Integer> curr = new ArrayList();
        function(root,targetSum,all,curr);
        return all;
    }
    public void function(TreeNode root,int sum,List<List<Integer>> all,List<Integer> curr){
        if(root==null)return;
        curr.add(root.val);
        if(root.val==sum && root.left == null && root.right == null){
            all.add(new ArrayList(curr));
        }
        else{
            function(root.left,sum-root.val,all,curr);
            function(root.right,sum-root.val,all,curr);
        }
        curr.remove(curr.size()-1);
    }
}