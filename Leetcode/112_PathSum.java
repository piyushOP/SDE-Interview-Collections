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
    public boolean hasPathSum(TreeNode t, int s) {
        if (t == null) { return false; }
        if (t.left == null && t.right == null) { return (s == t.val); }
        boolean check = false;
        if (t.left != null) {
            check = check || hasPathSum(t.left, s-t.val);
        }
        if (!check && t.right != null) {
            check = check || hasPathSum(t.right, s-t.val);
        }
        return check;
    }
}
