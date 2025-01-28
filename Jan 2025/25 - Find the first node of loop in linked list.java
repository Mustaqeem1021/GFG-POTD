class Solution {
    public static Node findFirstNode(Node head) {
        if (head == null) {
            return null; 
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next; 
            if (slow == fast) {
                slow = head; 
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; 
            }
        }
        return null;
    }
}