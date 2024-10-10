class Solution {
    public int maxDistance(int[] arr) {
        int maxdist=0,n=arr.length;
        int l=0,r=n-1;
        while(l<n && (l+maxdist)<n){
            r=n-1;
            while(r>(l+maxdist) && arr[l]!=arr[r])
            r--;
            if(r>=0)
            maxdist=Math.max(maxdist,r-l);
            l++;
        }
        return maxdist;
    }
}

