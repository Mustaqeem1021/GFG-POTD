class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : arr1){
            arr.add(i);
        }
        for(int i : arr2){
            arr.add(i);
        }
        Collections.sort(arr);
        return arr.get(k - 1);
    }
}
