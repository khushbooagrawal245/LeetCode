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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        function(root,0);
        return list;
    }
    public void function(TreeNode root,int level){
     if(root == null)return;
        if(list.size()<level+1)list.add(new ArrayList<>());
        list.get(level).add(root.val);
        function(root.left,level+1);
        function(root.right,level+1);
    }
}