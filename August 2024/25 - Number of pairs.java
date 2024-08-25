class Solution {
    // Function to count number of pairs such that x^y is greater than y^x.
    public long countPairs(int x[], int y[], int M, int N) {
        // code here
         long c=0;
        for(int i =0;i<M;i++){
            for(int j =0;j<N;j++){
                double xy = Math.pow(x[i],y[j]);
                double yx = Math.pow(y[j],x[i]);
                if(xy>yx){
                c++;
                
            }
        }
        }
        return c;
    }
}
