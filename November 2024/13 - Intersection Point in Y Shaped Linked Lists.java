class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    Node find(Node head1, Node head2){
       if (head1 == null || head2 == null) return null;
        Node p1=head1;
        Node p2=head2;
         while (p1 != p2) {
        if (p1 == null) {
            p1 = head2;
        } else {
            p1 = p1.next;
        }
        if (p2 == null) {
            p2 = head1;
        } else {
            p2 = p2.next;
        }
    }
    return p1;    
    }
    
    int intersectPoint(Node head1, Node head2) {
        // code here
        Node n=find(head1,head2);
        if(n!=null){
            return n.data;
        }else{
            return -1;
        }
   
    }
}
