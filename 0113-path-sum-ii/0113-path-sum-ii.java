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
    public void helper(List<List<Integer>> ans,List<Integer> arr,TreeNode root,int ts){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            if(root.val==ts){
                List<Integer> a= new ArrayList<>();
                for(int i=0;i<arr.size();i++){
                    a.add(arr.get(i));
                }
                ans.add(a);
            }
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        helper(ans,arr,root.left,ts-root.val);
        helper(ans,arr,root.right,ts-root.val);
        arr.remove(arr.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        helper(ans,arr,root,targetSum);
        return ans;
    }
}