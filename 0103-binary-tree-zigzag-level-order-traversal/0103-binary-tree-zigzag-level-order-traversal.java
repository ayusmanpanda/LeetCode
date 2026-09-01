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
    //     if(root==null || root.left ==null && root.right==null) return 0;
    //     return 1+(Math.max(height(root.left),height(root.right)));
    // }
    // public void traverse1(TreeNode root,int n,List<Integer> arr){
    //     if(root==null) return;
    //     if(n==1){
    //         arr.add(root.val);
    //         return;
    //     } 
    //     traverse1(root.right,n-1,arr);
    //     traverse1(root.left,n-1,arr);
    // }
    // public void traverse2(TreeNode root,int n,List<Integer> arr){
    //     if(root==null) return;
    //     if(n==1){
    //         arr.add(root.val);
    //         return;
    //     } 
    //     traverse2(root.left,n-1,arr);
    //     traverse2(root.right,n-1,arr);
    // }
    // public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    //     List<List<Integer>> lst = new ArrayList<>();
    //     if(root==null) return lst;
    //     int height = height(root)+1;
    //     for(int i=1;i<=height;i++){
    //         List<Integer> temp = new ArrayList<>();
    //         if(i%2==0) traverse1(root,i,temp);
    //         else traverse2(root,i,temp);
    //         lst.add(temp);
    //     }
    //     return lst;
    // }


    public class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node =node;
            this.level= level;
        }
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> ans= new ArrayList<>();
        int h = height(root);
        for(int i=0;i<h;i++){
            List<Integer> temp = new ArrayList<>();
            ans.add(temp);
        }
        Queue<Pair> q= new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(q.size()>0){
            TreeNode temp = q.peek().node;
            int lvl= q.peek().level;
            if (lvl % 2 == 0){
                ans.get(lvl).add(temp.val);
            } 
            else{
                ans.get(lvl).add(0, temp.val);
            }
            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
            q.remove();
        }
        return ans;
    }
}