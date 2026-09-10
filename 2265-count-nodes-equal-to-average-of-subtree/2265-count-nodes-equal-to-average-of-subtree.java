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

    int count;

    public int findAvg(TreeNode root) {
        if (root == null) return 0;
        count++;
        return root.val + findAvg(root.left) + findAvg(root.right);
    }

    public int averageOfSubtree(TreeNode root) {
        if (root == null) return 0;
        count = 0;
        int sum = findAvg(root);
        int ans = (sum / count == root.val) ? 1 : 0;
        return ans + averageOfSubtree(root.left)+ averageOfSubtree(root.right);
    }
}