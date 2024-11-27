class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(arr).forEach(set::add);
        int res = 0;
        for(int i=1;;i++){
            if(!set.contains(i)){
                res = i;
                break;
            }
        }
        return res;
    }
}
