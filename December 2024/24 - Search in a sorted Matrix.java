class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code 
        
        int n=mat.length;
        int m=mat[0].length;
        
        int a=-1;
        for(int i=0;i<mat.length;i++){
            
            if(mat[i][0]<=x && mat[i][m-1]>=x){
                a=i;
                break;
            }
          
        }
    
        if(a==-1)return false;
        
        int i=0;
        int j=m-1;
        
        while(i<=j){
            int mid=(i+j)/2;
            if(mat[a][mid]==x)return true;
            else if(mat[a][mid]<x){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return false;
    }
}
