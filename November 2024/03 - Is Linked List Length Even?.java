class Solution {
    public boolean isLengthEven(Node head) {
       //MZH
        int count=0;
        while(head!=null)
        {
            head=head.next;
            count++;
            
        }
        return count%2==1?false:true;
    }
}
