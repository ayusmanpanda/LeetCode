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
    // Method 1
    // public int height(TreeNode root){
    //     if(root==null) return 0;
    //     return 1+Math.max(height(root.left),height(root.right));
    // }
    // public boolean isBalanced(TreeNode root) {
    //     if(root == null) return true;
    //     int diff = Math.abs(height(root.left)-height(root.right));
    //     if(diff>1) return false;
    //     return(isBalanced(root.left) && isBalanced(root.right));
    // }

    // Method 2
    static boolean ans;
    public int height(TreeNode root){
        if(root==null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diff = Math.abs(leftHeight-rightHeight);
        if(diff>1) ans= false;
        return 1+Math.max(leftHeight,rightHeight);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        ans=true;
        height(root);
        return ans;
    }
}