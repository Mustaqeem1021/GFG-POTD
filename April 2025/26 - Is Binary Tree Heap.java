class Solution {
    boolean isComplete(Node node) {
        StringBuilder lvlOrder = new StringBuilder();
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while (!queue.isEmpty()) {
            int n = queue.size();
            
            while (n-- > 0) {
                Node currNode = queue.poll();
                if (currNode == null) {
                    lvlOrder.append("N");
                    continue;
                }
                lvlOrder.append(currNode.data);
                queue.offer(currNode.left);
                queue.offer(currNode.right);
            }
        }
        
        for (int i = 0; i < lvlOrder.length() - 1; i++) {
            if (lvlOrder.charAt(i) == 'N' && lvlOrder.charAt(i + 1) != 'N') {
                return false;
            }
        }
        
        return true;
    }
    
    boolean isHeap(Node root) {
        return isComplete(root) ? helper(root) : false;
    }
    
    boolean helper(Node node) {
        if (node == null) {
            return true;
        }
        
        if (node.left != null && node.left.data > node.data) {
            return false;
        }
        
        if (node.right != null && node.right.data > node.data) {
            return false;
        }
        
        return helper(node.left) && helper(node.right); 
    }
}
