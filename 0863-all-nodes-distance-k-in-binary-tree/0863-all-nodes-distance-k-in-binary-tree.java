import java.util.*;

class Solution {

    public static void populateParentMap(TreeNode node, TreeNode parent, Map<TreeNode, TreeNode> parentMap) {
        if (node == null) {
            return;
        }

        parentMap.put(node, parent);

        populateParentMap(node.left, node, parentMap);
        populateParentMap(node.right, node, parentMap);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // Step 1: Map each node to its parent node
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        populateParentMap(root, null, parentMap);

        // Step 2: Run BFS outward from the target node
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        
        queue.add(target);
        visited.add(target);
        
        int currentDistance = 0;

        // Loop until we reach distance k or the queue is empty
        while (!queue.isEmpty()) {
            // If we reached the target distance, break to collect answers
            if (currentDistance == k) {
                break;
            }
            
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                // 1. Move Down Left
                if (current.left != null && !visited.contains(current.left)) {
                    visited.add(current.left);
                    queue.add(current.left);
                }

                // 2. Move Down Right
                if (current.right != null && !visited.contains(current.right)) {
                    visited.add(current.right);
                    queue.add(current.right);
                }

                // 3. Move Up to Parent
                TreeNode parent = parentMap.get(current);
                if (parent != null && !visited.contains(parent)) {
                    visited.add(parent);
                    queue.add(parent);
                }
            }
            // Increment distance after exploring the entire current level
            currentDistance++;
        }

        // Step 3:Collect all node values remaining in the queue
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().val);
        }
        
        return result;
    }
}
