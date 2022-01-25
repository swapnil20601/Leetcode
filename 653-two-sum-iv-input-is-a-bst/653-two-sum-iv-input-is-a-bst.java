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
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }

        //for traversing & creating stack for left subtree-->gives you items in sorted order after calling getElement();
        BSTIterator left = new BSTIterator(root, false);

        //for traversing & creating stack for right subtree-->gives you items in descending order after calling getElement();
        BSTIterator right = new BSTIterator(root, true);

        int l = left.getElement();
        int r = right.getElement();

        while(l < r){
            if(l + r == k){
                return true;
            }
            else if( l + r < k){
                l = left.getElement();
            }
            else{
                r = right.getElement();
            }
        }
        
        return false;
    }
}

class BSTIterator{
    Stack<TreeNode> stack = new Stack<>();

    //if isReverse = false means we are moving in leftSubtree looking for ascending order & 
    //if its true then we are moving in rightSubtree looking for descending order
    boolean isReverse = false;

    public BSTIterator(TreeNode root, boolean isReverse){
        this.isReverse = isReverse;
        pushAll(root);
    }

    private void pushAll(TreeNode node) {
        while(node != null){
            stack.push(node);
            if(this.isReverse == true){
                node = node.right;
            }
            else {
                node = node.left;
            }
        }
    }

    //return the smallest or largest number depending upon isReverse's value
    public int getElement(){
        TreeNode node = stack.pop();
        if(this.isReverse == true){
            pushAll(node.left);
        }
        else{
            pushAll(node.right);
        }
        return node.val;
    }
}
