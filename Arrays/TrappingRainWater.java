class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        int LMax[] = new int[n];
        int RMax[] = new int[n];
        
        LMax[0] = arr[0];
        RMax[n-1] = arr[n-1];
        
        long rWater=0;
        
        for (int i=1; i<n; i++) {
            LMax[i] = Math.max(arr[i], LMax[i-1]);
        }
        
        for (int j=n-2; j>=0; j--) {
            RMax[j] = Math.max(arr[j], RMax[j+1]);
        }
        
        for (int k=1; k<n-1; k++) {
            rWater += (Math.min(LMax[k], RMax[k]) - arr[k]);
        }
        
        return rWater;
    } 
}