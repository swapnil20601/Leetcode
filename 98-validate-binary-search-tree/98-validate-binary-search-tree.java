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

/*
For understanding 3 different approaches refer https://github.com/swapnil20601/DSA/tree/main/Trees/BST/check_IS_BST
*/
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private static boolean helper(TreeNode root, long minRange, long maxRange) {
        if(root == null){
            return true;
        }

        if(root.val <= minRange || root.val >= maxRange){
            return false;
        }

        boolean isLeftInRange = helper(root.left, minRange, root.val);
        boolean isRightInRange = helper(root.right, root.val, maxRange);

        return isLeftInRange && isRightInRange;
    }
}