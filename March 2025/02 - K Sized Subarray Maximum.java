class Pair{
    int index;
    int value;
    public Pair(int index, int value){
        this.index = index;
        this.value = value;
    }
}
class Solution {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.value - a.value);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<k; i++){
            pq.add(new Pair(i, arr[i]));
        }
        int left = 0, right = 0;
        while(right < arr.length){
            if(right < k-1){
                pq.add(new Pair(right, arr[right]));
                right++;
            }else{
                pq.add(new Pair(right, arr[right]));
                while(!pq.isEmpty() && pq.peek().index < left){
                    pq.poll();
                }
                list.add(pq.peek().value);
                left++;
                right++;
            }
        }
        return list;
    }
}
