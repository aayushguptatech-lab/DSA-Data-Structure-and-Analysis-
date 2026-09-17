/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


// class Solution {
//     public boolean contains(TreeNode root, TreeNode node){
//         if(root == null) return false;
//         if(root == node) return true;
//         return contains(root.left, node) || contains(root.right, node);
//     }
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root == null) return null;

//         if(p == root || q == root) return root;
//         if(p==q) return p;

//         boolean leftp = contains(root.left, p);
//         boolean rightq = contains(root.right, q);

//         if(leftp == true && rightq == true){
//             return root;
//         }
//         if(leftp == true && rightq == false){
//             return lowestCommonAncestor(root.left, p, q);
//         }
//         if(leftp == false && rightq == true){
//             return lowestCommonAncestor(root.right, p, q);
//         }
//         if(leftp == false && rightq == false){
//             return root;
//         }
        
//         return null;
//     }
// }




// optimized apprach --> O(n)
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) return null;

        if(root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;
        }

        if(left != null){
            return left;
        }

        return right;
    }
}