class Solution {
    public Node addOne(Node head) {
        // code here.
        int car = add(head.next);
        if (car==1)
        {
            head.data+=1;
        }
        return head;
    }
    int add(Node head)
    {
        int car = 0;
        if(head.next == null)
        {
            head.data += 1;
            
        }
        else
        {
            head.data+=add(head.next);
            
        }
        
        if(head.data>9)
        {
            head.data = head.data%10;
            car = 1;
        }
        return car;
    }
}
