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
//     public void helper(TreeNode root, List<Integer> arr){
//         if(root==null) return; 
//         helper(root.left,arr);
//         arr.add(root.val);
//         helper(root.right,arr);
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> arr=new ArrayList<>();
//         helper(root,arr);
//         return arr;
//     }
// }

//OR 

//Using Stack
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        Stack<TreeNode> st= new Stack<>();
        TreeNode temp = root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp =temp.left;
            }
            else{
                if(st.size()==0) break;
                TreeNode top = st.pop();
                arr.add(top.val);
                temp = top.right;
            }
        }
        return arr;
    }
}