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
import java.util.*;
class BSTIterator {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    
    public BSTIterator(TreeNode root) {
        //Initially push all the nodes that are left to root(samllest nodes than root) in stack until you reach null
        pushLeft(root);
    }
    
    //pop the top node from stack & return it. Before returning, add all right children of that node too in stack if any and then return 
    public int next() {
        TreeNode topNode = stack.pop();
        pushLeft(topNode.right);
        return topNode.val;
    }
    
    //if stack is empty then return false otherwise return true
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    
    private void pushLeft(TreeNode node){
        while(node != null){
            stack.push(node);
            node = node.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */