class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        int max_idx = n-1;
        int min_idx = 0;
        long max_num = arr[n-1] + 1;
        for (int i=0; i<n; i++) {
            if (i%2==0) {
                arr[i]+= (arr[max_idx]%max_num)*max_num;
                max_idx--;
            } else {
                arr[i]+= (arr[min_idx]%max_num)*max_num;
                min_idx++;
            }
        }
        
        for (int j=0; j<n; j++) {
            arr[j]/=max_num;
        }
        
    }
    
}