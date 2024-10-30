package leetcode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        } else if (root.left == null && root.right == null){
            return (root.val == targetSum);
        }
        return (hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val));
    }
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (targetSum == 0 && ){
//            return true;
//        }else if (root == null || targetSum<0) {
//            return false;
//        }
//        return (hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val));
//    }


//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null || (targetSum - root.val) < 0) {
//            return false;
//        }else if ((targetSum - root.val) == 0){
//            return true;
//        }
//        return (hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val));
//    }
}
