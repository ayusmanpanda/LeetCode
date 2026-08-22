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
    //METHOD 1
    // public TreeNode invert(TreeNode root){
    //     if(root==null) return root;
    //     TreeNode l= root.left;
    //     TreeNode r = root.right;
    //     root.left=invert(r);
    //     root.right= invert(l);
    //     return root;
    // }
    // public boolean isSame(TreeNode root,TreeNode temp){
    //     if(root==null && temp==null) return true;
    //     if(root==null || temp==null) return false;
    //     if(root.val!=temp.val) return false;
    //     return isSame(root.left,temp.left)&& isSame(root.right,temp.right);
    // }
    // public boolean isSymmetric(TreeNode root) {
    //     TreeNode temp = root.left;
    //     invert(temp);
    //     return isSame(root.right,temp);
    // }

    // METHOD 2
    public boolean mirror(TreeNode root,TreeNode temp){
        if(root==null && temp==null) return true;
        if(root==null || temp==null) return false;
        if(root.val!=temp.val) return false;
        return mirror(root.left,temp.right)&& mirror(root.right,temp.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.right,root.left);
    }
}