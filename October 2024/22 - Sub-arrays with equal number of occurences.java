class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int currDiff =0;
        int count =0;
        
        for(int num:arr){
            if(num==x){
                currDiff++;
            }else if(num==y){
                currDiff--;
            }
            if(map.containsKey(currDiff)){
              count+= map.get(currDiff);
            }
            
            map.put(currDiff, map.getOrDefault(currDiff,0)+1);
        }
        
        return count;
    }
}
