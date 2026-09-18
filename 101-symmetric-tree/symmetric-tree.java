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


//  hint --> take these questions as the reference
// 1) Same Tree
// 2) Invert Binary Tree
class Solution {
    public static boolean isMirror(TreeNode left, TreeNode right){

        if(left == null && right==null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);  //if both statisfied then it will return true, else return false
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if(root.left == null || root.right == null) return false;

        return isMirror(root.left, root.right);   
    }
}