class Solution {
    static int Ans;
    static void MergeSort(int[] arr,int start,int end){
        if(start>=end)return;
        int mid=start+(end-start)/2;
        MergeSort(arr,start,mid);
        MergeSort(arr,mid+1,end);
        Merge(arr,start,mid,end);
    }
    static void Merge(int[] arr,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=start,j=mid+1,k=0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                Ans+=mid-i+1;  // Inversion Counting
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;k++;
        }
        while(j<=end){
            temp[k]=arr[j];
            j++;k++;
        }
        for(int x=0;x<temp.length;x++){
            arr[start]=temp[x];
            start++;
        }
        return;
    }
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        Ans=0;
        MergeSort(arr,0,arr.length-1);
        return Ans;
    }
}
