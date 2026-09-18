
// Method -2 :- by using isSame Tree + Invert Binary Tree

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public TreeNode invertTree(TreeNode root) {
        // just swapping is used here
        if(root == null) return root;
        if(root.left == null && root.right == null) return root;
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;

        return root;
    }


    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        root.left = invertTree(root.left);
        return isSameTree(root.left, root.right);
    }
}


// Method - 1:-

// class solution{
//     public static boolean isMirror(TreeNode left, TreeNode right){

//         if(left == null && right==null){
//             return true;
//         }
//         if(left == null || right == null){
//             return false;
//         }
//         if(left.val != right.val){
//             return false;
//         }
//         return isMirror(left.left, right.right) && isMirror(left.right, right.left);  //if both statisfied then it will return true, else return false
//     }
//     public boolean isSymmetric(TreeNode root) {
//         if(root == null) return true;
//         if(root.left == null && root.right == null) return true;
//         if(root.left == null || root.right == null) return false;

//         return isMirror(root.left, root.right);   
//     }
// }