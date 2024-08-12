class Solution {
    long floorSqrt(long n) {
        long low =1,high=n,mid,ans=1,l;
        
        while(low<=high){
            mid = (low+high)/2;
            l=mid*mid;
            
        if(l <=n){
            low = mid+1;
            
        }
            else{
                high=mid-1;
                
            }
        }
        // Your code here
        return high;
    }
}
