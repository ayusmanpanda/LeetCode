/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public boolean check(TreeNode root,TreeNode node){
        if(root==null) return false;
        if(root==node) return true;
        return check(root.left,node) || check(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q) return root;
        if(p==q) return p;
        boolean left= check(root.left,p);
        boolean right=check(root.right,q);
        if(left && right) return root;
        if(!left && right) return lowestCommonAncestor(root.right,p,q);
        if(left && !right) return lowestCommonAncestor(root.left,p,q);
        return root;
    }
}