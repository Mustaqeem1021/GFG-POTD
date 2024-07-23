class Solution {
    
    void addNode(Node node,ArrayList<Integer> a){
        if(node==null)return ;
        addNode(node.left,a);
        a.add(node.data);
        addNode(node.right,a);
    }
    
    List<Integer> mergeArray(ArrayList<Integer> a1,ArrayList<Integer> a2){
        List<Integer> temp=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a1.size() && j<a2.size()){
            if(a1.get(i)<a2.get(j)){
                temp.add(a1.get(i));
                i++;
            }else {
                temp.add(a2.get(j));
                j++;
            }
        }
        while(i<a1.size()){
            temp.add(a1.get(i));
             i++;
        }
        while(j<a2.size()){
            temp.add(a2.get(j));
            j++;
        }
        return temp;
    }
  
    public List<Integer> merge(Node root1, Node root2) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        addNode(root1, a1);
        addNode(root2, a2);
        List<Integer> ans=mergeArray(a1,a2);
        return ans;
    }
}
