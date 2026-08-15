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

    List<Integer> ans = new ArrayList<>();

    void DFS(TreeNode root, int level) {

        if (root == null) {
            return;
        }

        if (level == ans.size()) {
            ans.add(root.val);
        }

        DFS(root.right, level + 1);
        DFS(root.left, level + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {

        DFS(root, 0);

        return ans;
    }
}