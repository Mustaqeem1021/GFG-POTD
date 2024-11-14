class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0, j=0;
        while(j < arr.length){
            pq.add(arr[j]);
            j++;
            if(pq.size() > k){
                arr[i] = pq.poll();
                i++;
            }
        }
        
        while(pq.size() > 0){
            arr[i] = pq.poll();
            i++;
        }
    }
}
