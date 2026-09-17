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

    public static List<String> fun(TreeNode root, List<String> st, String path){
        if(root == null) return st;

        path = path + root.val;

        if(root.left == null && root.right == null){
            st.add(path);
            return st;
        } 

        path = path + "->";
        // System.out.println(root.val+"->");
        
        // st.add(String. valueOf(root.val)+"->");
        fun(root.left, st, path);
        fun(root.right, st, path);

        return st;
    } 

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> st = new ArrayList<>();

        return fun(root, st, "");
    }
}