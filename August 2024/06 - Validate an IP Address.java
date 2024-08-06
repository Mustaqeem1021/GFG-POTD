class Solution {

    public boolean isValid(String str) 
    
    {
        String[] arr=str.split("\\.");
        if(arr.length!=4)
            return false;
        
        for(int i=0;i<arr.length;i++)
        {
            int l=arr[i].length();
            if(l>1 && arr[i].charAt(0)=='0')
                return false;
            
            if(arr[i].isEmpty() || arr[i].length()>3 ||

 Integer.parseInt(arr[i])<0  || Integer.parseInt(arr[i])>255)


            {
                return false;
            }
        }
        return true;
    }
}

