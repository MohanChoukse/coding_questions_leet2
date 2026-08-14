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

    class Info {
        TreeNode node;
        int row;
        int col;

        Info(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        TreeMap<Integer, List<Info>> map = new TreeMap<>();

        Queue<Info> q = new LinkedList<>();

        q.add(new Info(root, 0, 0));

        while (!q.isEmpty()) {

            Info current = q.poll();

            TreeNode node = current.node;
            int row = current.row;
            int col = current.col;

            if (!map.containsKey(col)) {
                map.put(col, new ArrayList<>());
            }

            map.get(col).add(current);

            if (node.left != null) {
                q.add(new Info(node.left, row + 1, col - 1));
            }

            if (node.right != null) {
                q.add(new Info(node.right, row + 1, col + 1));
            }
        }

        for (List<Info> list : map.values()) {

            Collections.sort(list, (a, b) -> {

                if (a.row != b.row) {
                    return a.row - b.row;
                }

                return a.node.val - b.node.val;
            });

            List<Integer> column = new ArrayList<>();

            for (Info info : list) {
                column.add(info.node.val);
            }

            ans.add(column);
        }

        return ans;
    }
}