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
    public static int height(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    public static int diameter(TreeNode root){
        if(root == null) return 0;
        int ans = height(root.left) + height(root.right);

        int leftdia = diameter(root.left);
        int rightdia = diameter(root.right);

        return Math.max(ans, Math.max(leftdia, rightdia));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int ans = diameter(root);
        return ans;
    }
}