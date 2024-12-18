class Solution {
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
         if (head==null) return null;
        Node current=head;
        while(current!=null){
            Node copy=new Node(current.data);
            copy.next=current.next;
            current.next=copy;
            current=copy.next;
        }
        current =head;
        while(current!=null){
            if(current.random!=null){
                current.next.random=current.random.next;
            }
            current=current.next.next;
        }
        current=head;
        Node copyhead=current.next;
        Node copycurrent = copyhead;
        while(current!=null){
            current.next=current.next.next;
            if(copyhead.next!=null){
                copyhead.next=copyhead.next.next;
            }
            current=current.next;
            copyhead=copyhead.next;
        }
        return copycurrent;
    }
}

