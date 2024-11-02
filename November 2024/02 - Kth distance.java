import java.util.stream.IntStream;
class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {

         Map<Integer, Integer> indexMap = new HashMap<>();
    
        return IntStream.range(0, arr.length)
            .anyMatch(i -> {
                int val = arr[i];
                boolean isDuplicateWithinK = indexMap.containsKey(val) && (i - indexMap.get(val)) <= k;
                indexMap.put(val, i);
                return isDuplicateWithinK;
            });
    }
}

