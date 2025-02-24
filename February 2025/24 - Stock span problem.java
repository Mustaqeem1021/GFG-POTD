class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
    	HashMap<Integer,Integer> map=new HashMap<>();
    	int n=arr.length;
    	Stack<Integer> st=new Stack<>();
    	st.add(arr[0]);
    	int span[]=new int[n];
    	span[0]=-1;
    	map.put(arr[0],0);
    	int spanInd[]=new int[n];
    	
    	for(int i=1;i<n;i++) {
    	    map.put(arr[i], i);    
    		if(arr[i]<st.peek()){
    			span[i]=st.peek();
    			st.push(arr[i]);
    			spanInd[i]=map.get(span[i]);
    		}else {
    			while(!st.isEmpty() && st.peek()<=arr[i]) {
    				st.pop();
    			}
    			if(st.size()==0) {
    				span[i]=-1;
    				st.add(arr[i]);
    			}else {
    				span[i]=st.peek();
    				spanInd[i]=map.get(span[i]);
    				st.add(arr[i]);    				
    			}
    		}
    	}
    	
    	ans.add(1);
    	for(int i=1;i<n;i++) {
    		if(span[i]==-1) {
    			ans.add(i+1);
    			continue;
    		}
    		int temp=i-spanInd[i];
    		ans.add(temp);
    	}
    	
    	
        return ans; 
    }
}
