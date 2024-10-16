class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        Node odd = new Node(-1);
        Node oddTail = odd;
        Node even = new Node(-1);
        Node evenTail = even;
        while (head != null) {
            oddTail.next = head;
            head = head.next;
            oddTail = oddTail.next;
            oddTail.next = null;
            if (head != null) {
                evenTail.next = head;
                head = head.next;
                evenTail = evenTail.next;
                evenTail.next = null;
            }
        }
        return new Node[]{odd.next, even.next};
    }
}
