class Solution {
    // Function to check whether the list is palindrome.
    public static Node reverse(Node head)
    {
        if(head==null || head.next==null) return head;
        Node newHead=reverse(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
    boolean isPalindrome(Node head) {
        // Your code here
        if(head==null || head.next==null) return true;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        Node newHead=reverse(slow.next);
        Node temp=newHead;
        Node curr=head;
        while(temp!=null)
        {
            if(curr.data!=temp.data){
                reverse(newHead);
                return false;
            }
            temp=temp.next;
            curr=curr.next;
        }
        reverse(newHead);
        return true;
    }
}
