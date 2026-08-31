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
    public int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void helper(TreeNode root,int val,int lvl,List<Integer> temp){
        if(root==null || lvl>val) return;
        if(val==lvl) temp.add(root.val);
        helper(root.left,val,lvl+1,temp);
        helper(root.right,val,lvl+1,temp);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        int h = height(root);
        for(int i=0;i<h;i++){
            List<Integer> temp = new ArrayList<>();
            helper(root,i,0,temp);
            ans.add(temp);
        }
        return ans;
    }
}