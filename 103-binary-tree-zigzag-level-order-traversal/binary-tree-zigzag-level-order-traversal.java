class Solution {
    public static void NthLevel1(TreeNode root, int n, List<Integer>arr){
        if(root == null) return;
        if(n==1){
            arr.add(root.val);
            return;
        }
        NthLevel1(root.left, n-1, arr);
        NthLevel1(root.right, n-1, arr);
    }

    public static void NthLevel2(TreeNode root, int n, List<Integer>arr){
        if(root == null) return;
        if(n==1){
            arr.add(root.val);
            return;
        }
        NthLevel2(root.right, n-1, arr);
        NthLevel2(root.left, n-1, arr);
    }

    public static int height(TreeNode root){
        if(root == null) return 0;
        return 1+ Math.max(height(root.left), height(root.right));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        int level = height(root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=level; i++){
            List<Integer> arr = new ArrayList<>();
            if(i%2!=0) NthLevel1(root, i, arr);
            else NthLevel2(root, i, arr);
            ans.add(arr);
        }
        return ans;
    }
}