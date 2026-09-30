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
    // Array Copy
    public List<Integer> copy(List<Integer> arr){
        List<Integer> list= new ArrayList<>();
        for(int ele:arr){
            list.add(ele);
        }
        return list;
    }
    public void helper(TreeNode root, int target,List<List<Integer>> ans,List<Integer> arr) {
        if(root==null) return;
        arr.add(root.val);
        if(root.left==null && root.right==null) {
            if(target==root.val){
                ans.add(arr);
            }
            return;
        }
        List<Integer> arr1 = copy(arr);
        List<Integer> arr2 = copy(arr);
        helper(root.left,target-root.val,ans,arr1);
        helper(root.right,target-root.val,ans,arr2);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<Integer>();
        helper(root,targetSum,ans,arr);
        return ans;
    }
}