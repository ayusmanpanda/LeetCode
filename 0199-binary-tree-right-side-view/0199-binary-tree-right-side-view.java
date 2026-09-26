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
// class Solution {
//     public int height(TreeNode root){
//         if(root==null || root.left==null && root.right==null) return 0;
//         return 1+ Math.max(height(root.left), height(root.right));
//     }
//     public void nthLevel(TreeNode root,int n,List<Integer> arr){
//         if(root==null) return;
//         if(n==1){
//             arr.add(root.val);
//             return;
//         }
//         nthLevel(root.left, n-1,arr);
//         nthLevel(root.right, n-1,arr);
//     }
//     public List<List<Integer>> levelOrder(TreeNode root){
//         int level = height(root)+1;
//         List<List<Integer>> ans = new ArrayList<>();
//         if(root==null) return ans;
//         for(int i=1;i<=level;i++){
//             List<Integer> arr= new ArrayList<>();
//             nthLevel(root,i,arr);
//             ans.add(arr);
//         }
//         return ans;
//     }
//     public List<Integer> rightSideView(TreeNode root) {
//         List<List<Integer>> lst = levelOrder(root);
//         List<Integer> arr = new ArrayList<>();
//         for(int i=0;i<lst.size();i++){
//             List<Integer>ans= lst.get(i);
//             int lastEle = ans.get(ans.size()-1);
//             arr.add(lastEle);
//         }
//         return arr;
//     }
// }



class Solution {
    public int height(TreeNode root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+ Math.max(height(root.left), height(root.right));
    }
    public void preOrder(TreeNode root,List<Integer>ans,int level){
        if(root==null) return;
        ans.set(level-1,root.val);
        preOrder(root.left,ans,level+1);
        preOrder(root.right,ans,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        if(root==null) return ans;
        int h= height(root)+1;
        for(int i=0;i<h;i++){
            ans.add(0);
        }
        preOrder(root,ans,1);

        return ans;
    }
}