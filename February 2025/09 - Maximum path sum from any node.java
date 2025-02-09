class Solution {
    
    static int sum(Node root, int[] maxi) {
        
        if (root == null) {
            return 0;
        }

        int ls = Math.max(0, sum(root.left, maxi));
        int rs = Math.max(0, sum(root.right, maxi));

        maxi[0] = Math.max(maxi[0], ls + rs + root.data);

        return root.data + Math.max(ls, rs);
    }

    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node root) {
        
        int[] maxi = new int[1];

        maxi[0] = Integer.MIN_VALUE;

        sum(root, maxi);

        return maxi[0];
    }
}
