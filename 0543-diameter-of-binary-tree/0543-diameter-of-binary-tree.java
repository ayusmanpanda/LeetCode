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
    // public int height(TreeNode root){
    //     if(root==null || root.left==null && root.right==null) return 0;
    //     return 1+Math.max(height(root.left),height(root.right));
    // }
    // public int diameterOfBinaryTree(TreeNode root) {
    //     if(root==null || root.left==null && root.right==null) return 0;
    //     int leftHeight= diameterOfBinaryTree(root.left);
    //     int rightHeight= diameterOfBinaryTree(root.right);
    //     int count= height(root.left)+height(root.right);
    //     if(root.right!=null) count++;
    //     if(root.left!=null) count++;
    //     return Math.max(leftHeight,Math.max(rightHeight,count));

    // }

    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root){
        if(root==null) return 0;
        int dia=levels(root.left)+levels(root.right);
        int a = diameterOfBinaryTree(root.left);
        int b = diameterOfBinaryTree(root.right);
        return Math.max(dia,Math.max(a,b));
    }
}