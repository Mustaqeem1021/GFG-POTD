class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        paths(root, list, new ArrayList<Integer>());
        return list; 
    }
    
    private static void paths(Node root, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp){
        if(root == null){
            // list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(root.data);
        paths(root.left, list, temp);
        paths(root.right, list, temp);
        if(root.left == root.right) list.add(new ArrayList<>(temp));
        temp.remove(temp.size()-1);
    }
}
