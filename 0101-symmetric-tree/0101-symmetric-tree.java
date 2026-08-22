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
    public TreeNode invert(TreeNode root){
        if(root==null) return root;
        TreeNode l= root.left;
        TreeNode r = root.right;
        root.left=invert(r);
        root.right= invert(l);
        return root;
    }
    public boolean isSame(TreeNode root,TreeNode temp){
        if(root==null && temp==null) return true;
        if(root==null || temp==null) return false;
        if(root.val!=temp.val) return false;
        return isSame(root.left,temp.left)&& isSame(root.right,temp.right);
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode temp = root.left;
        invert(temp);
        return isSame(root.right,temp);
    }
}