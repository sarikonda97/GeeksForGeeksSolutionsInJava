class Solution {
    //Function to reverse every sub-array group of size k.
    void reverse(ArrayList<Integer> arr, int low, int high) {
        int temp;
        while (low < high) {
            temp = arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);
            
            low++;
            high--;
        }
    }
    
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int i;
        for (i=0; i<n/k; i++) {
            reverse(arr, i*k, k*(i+1)-1);
        }
        reverse(arr, i*k, n-1);
    }
}