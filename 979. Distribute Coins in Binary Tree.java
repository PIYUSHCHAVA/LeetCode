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
    int steps=0;
    public int distributeCoins(TreeNode root)
    {
        helper(root);
        return steps;
    }
    public int helper(TreeNode root)
    {
        if(root == null)
            return 0;

        int l=helper(root.left);
        int r=helper(root.right);
        steps=steps + Math.abs(l) + Math.abs(r);
        return (l + r + root.val- 1);        
    }
}