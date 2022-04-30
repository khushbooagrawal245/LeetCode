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
   
    public void inorder(TreeNode node,ArrayList<Integer> array){
        
        if(node == null){
            return;
        }
        inorder(node.left,array);
        array.add(node.val);
        inorder(node.right,array);
        
        
    }
    public boolean isValidBST(TreeNode node)
    {
        // code here.
        ArrayList<Integer> arr = new ArrayList<Integer>();
       inorder(node,arr);
      for(int i=1;i<arr.size();i++){
        if(arr.get(i-1) >= arr.get(i)){
            return false;
        }
      }
      return true;
    }
}