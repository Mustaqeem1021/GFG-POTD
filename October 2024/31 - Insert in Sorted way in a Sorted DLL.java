class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node ins=new Node(x);
        Node curr=head;
        if(head.data>x)
        {
            ins.next=head;
            if(head!=null)
            head.prev=ins;
            return ins;
        }
        while(curr.next!=null&&curr.next.data<x)
        {
            curr=curr.next;
        }
        ins.next=curr.next;
        if(curr.next!=null)
        curr.prev=ins;
        ins.prev=curr;
        curr.next=ins;
        return head;
    }
}
