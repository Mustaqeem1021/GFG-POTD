class Solution {

    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        int n = arr.length, i = 0, j = 0, st = 0, en = 0;
        Deque<Integer> mn = new LinkedList<>(), mx = new LinkedList<>();
        
        while (j < n) {
            while (!mn.isEmpty() && mn.peekLast() > arr[j]) mn.pollLast();
            while (!mx.isEmpty() && mx.peekLast() < arr[j]) mx.pollLast();
            mx.addLast(arr[j]);
            mn.addLast(arr[j]);
            
            if (!mx.isEmpty() && !mn.isEmpty() && (mx.peekFirst() - mn.peekFirst() <= x)) {
                if ((en - st) < (j - i)) {
                    en = j;
                    st = i;
                }
                j++;
            } else if (i < j && !mx.isEmpty() && !mn.isEmpty() && (mx.peekFirst() - mn.peekFirst() > x)) {
                if (arr[i] == mn.peekFirst()) mn.pollFirst();
                if (arr[i] == mx.peekFirst()) mx.pollFirst();
                i++;
                j++;
            }
        }
        
        if (st == en) return new ArrayList<>(Collections.singletonList(arr[0]));
        ArrayList<Integer> res = new ArrayList<>();
        for (int k = st; k <= en; k++) res.add(arr[k]);
        return res;
        
    }
}
