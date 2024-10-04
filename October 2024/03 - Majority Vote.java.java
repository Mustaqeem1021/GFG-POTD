class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        
        List<Integer> ans = new ArrayList<>();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.size();i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if( entry.getValue()>(nums.size()/3)){
                ans.add(entry.getKey());
            }
        }
        if(ans.size()==0) ans.add(-1);
        return ans;
    }
}
