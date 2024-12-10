class Solution {
    static int minRemoval(int intervals[][]) {
        ArrayList<Pair> arr = new ArrayList<>();
       for(int i =0; i<intervals.length; i++) {
           arr.add(new Pair (intervals[i][0], intervals[i][1]));
       }
       Collections.sort(arr);
       int ans = 0;
       Pair prev = arr.get(0);
       for(int i = 1; i<arr.size(); i++) { 
           Pair curr = arr.get(i);
           if(curr.a < prev.b) {
               ans++;
           }
           else prev = curr;
       }
       return ans ;
    }
}

class Pair implements Comparable<Pair> {
    int a;
    int b;
    public Pair (int a , int b) {
        this.a = a;
        this.b = b;
    }
    public int compareTo(Pair p) {
        //if(this.b == p.b)  return this.a - p.a;
        return this.b - p.b;
    }
}

