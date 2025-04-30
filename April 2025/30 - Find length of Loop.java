class Solution {
    // Function to find the length of a loop in the linked list.
    
    public static int countLoopLength(Node nodeinloop)
    {
        Node temp = nodeinloop;
        int count = 1;
        while(temp.next != nodeinloop)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public int countNodesinLoop(Node head) {
        // code here.
        
            Node slow = head;
            Node fast =head;
             while(fast != null && fast.next != null)
             {
                 slow = slow.next;
                 fast = fast.next.next;
                 
                 
                 if(slow == fast)
                 {
                     return countLoopLength(slow);
                 }
             }
        return 0;
        
    }
    
}
