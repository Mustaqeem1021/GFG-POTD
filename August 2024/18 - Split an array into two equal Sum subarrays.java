class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2!=0){
            return false;
        }
        int h=sum/2;
        int t=0;
        for(int i=0;i<arr.length;i++){
            t+=arr[i];
            if(t==h){
                return true;
            }
        }
        return false;
    }
}
