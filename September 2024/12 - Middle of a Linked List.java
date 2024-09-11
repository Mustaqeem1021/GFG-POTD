class Solution {
    int getMiddle(Node head) {
      Node slow=head;
      Node fast=head;
      
      while(fast.next!=null && fast.next.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }
      if(fast.next!=null){
          return slow.next.data;
      }
      return slow.data;
    }
}

