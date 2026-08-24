
class Solution {
    public void helper(List<String> ans,TreeNode root,String str){
        if(root==null) return;
        if(root.left==null && root.right==null){
            str += root.val;
            ans.add(str);
            return;
        } 
        helper(ans,root.left,str+root.val+"->");
        helper(ans,root.right,str+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(ans,root,"");
        return ans;
    }
}