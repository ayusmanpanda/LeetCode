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
    // public boolean contains(TreeNode root,TreeNode node){
    //     if(root==null) return false;
    //     if(root==node) return true;
    //     return (contains(root.left,node) || contains(root.right,node));
    // }
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if(p==root || q==root)return root;
    //     if(p==q) return p;
    //     boolean leftB = contains(root.left,p); //Check present in left branch or right
    //     boolean rightB = contains(root.right,q);
    //     if(leftB && rightB) return root;
    //     if(leftB == true && rightB == false) return lowestCommonAncestor(root.left,p,q);
    //     if(!leftB && rightB) return lowestCommonAncestor(root.right,p,q);
    //     return root;
    // }


    public boolean contains(TreeNode root,TreeNode node){
        if(root==null) return false;
        if(root==node) return true;
        return (contains(root.left,node) || contains(root.right,node));
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if(root==null || p==root || q==root) return root;
        if(p==q) return p;
        boolean leftP = contains(root.left,p);
        boolean leftQ = contains(root.left,q);
        if (leftP && leftQ) {
        return lowestCommonAncestor(root.left, p, q);
    }

    // Both are in right subtree
    if (!leftP && !leftQ) {
        return lowestCommonAncestor(root.right, p, q);
    }

        return root;
    }
}