class GfG {
    public static Node quickSort(Node node) {
        // Your code here
        if(node==null || node.next==null) return node;
        ArrayList<Integer>li=new ArrayList<>();
        Node cur=node;
        while(cur!=null){
            li.add(cur.data);
            cur=cur.next;
        }
        Collections.sort(li);
        cur=node;
        for(int i=0;i<li.size();i++){
            cur.data=li.get(i);
            cur=cur.next;
        }
        return node;
    }
}
