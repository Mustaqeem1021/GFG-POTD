class Solution {
    public int getCount(Node head) {
        // code here
        int count = 0;
        Node temp = head;
        if(head == null) {
            return 0;
        }
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
