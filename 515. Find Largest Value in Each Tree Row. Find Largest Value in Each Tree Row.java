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
    public static void calculate(TreeNode root,List<Integer> list, int height)
    {
        if(root==null)
            return ;
            int curr=root.val;
            if(list.size()==height)
                list.add(curr);
            else
            {
                if(curr > list.get(height))
                {
                    list.set(height,curr);
                }
            }
            calculate(root.right,list,height+1);
            calculate(root.left,list,height+1);
            return;

    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        calculate(root,list,0);
        return list;
    }
}