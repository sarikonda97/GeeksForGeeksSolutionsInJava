class Solution{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        
        // Your code here
        int diff;
        int min=Math.abs(arr[0]-arr[1]);
        for (int i=0; i<n; i++) {
            diff = Math.abs(arr[i%n]-arr[(i+1)%n]);
            if (min>diff) {
                min = diff;
            }
        }
        return min;
        
    }
}