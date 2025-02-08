class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) return result;

        // Add the root node (if it's not a leaf)
        if (!isLeaf(node)) {
            result.add(node.data);
        }

        // Traverse the left boundary (excluding leaves)
        addLeftBoundary(node.left, result);

        // Traverse all leaf nodes
        addLeaves(node, result);

        // Traverse the right boundary (excluding leaves, in reverse order)
        addRightBoundary(node.right, result);

        return result;
    }

    // Helper function to check if a node is a leaf
    private boolean isLeaf(Node node) {
        return node != null && node.left == null && node.right == null;
    }

    // Helper function to add the left boundary (excluding leaves)
    private void addLeftBoundary(Node node, ArrayList<Integer> result) {
        if (node == null || isLeaf(node)) return;

        result.add(node.data);

        // Traverse left if it exists, otherwise traverse right
        if (node.left != null) {
            addLeftBoundary(node.left, result);
        } else {
            addLeftBoundary(node.right, result);
        }
    }

    // Helper function to add all leaf nodes
    private void addLeaves(Node node, ArrayList<Integer> result) {
        if (node == null) return;

        if (isLeaf(node)) {
            result.add(node.data);
            return;
        }

        // Traverse left and right subtrees
        addLeaves(node.left, result);
        addLeaves(node.right, result);
    }

    // Helper function to add the right boundary (excluding leaves, in reverse order)
    private void addRightBoundary(Node node, ArrayList<Integer> result) {
        if (node == null || isLeaf(node)) return;

        // Traverse right if it exists, otherwise traverse left
        if (node.right != null) {
            addRightBoundary(node.right, result);
        } else {
            addRightBoundary(node.left, result);
        }

        // Add the node's data after recursion (to ensure reverse order)
        result.add(node.data);
    }
}

