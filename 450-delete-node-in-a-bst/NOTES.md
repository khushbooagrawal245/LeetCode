class Solution {
public TreeNode deleteNode(TreeNode root, int x) {
if(root==null) return null;
if(x<root.val){
root.left=deleteNode(root.left,x);
}else if(x>root.val){
root.right=deleteNode(root.right,x);
}else{
if(root.left==null) return root.right;
else if(root.right==null) return root.left;
root.val=minVal(root.right);
root.right=deleteNode(root.right,root.val);
}
return root;
}
public int minVal(TreeNode root){
while(root.left!=null){
root=root.left;
}
return root.val;
}
}