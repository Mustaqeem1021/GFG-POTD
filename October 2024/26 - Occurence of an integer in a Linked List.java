class Solution {
    public static int count(Node head, int key) {
        int count = 0;
        while(head != null){
            if(head.data == key){
                count++;
            }
            head = head.next;
        }
        return count;
    }
}

