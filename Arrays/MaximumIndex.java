class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
        
        int maxFromRight[] = new int[N];
        int minFromLeft[] = new int[N];
        
        maxFromRight[N-1] = A[N-1];
        minFromLeft[0] = A[0];
        
        // Your code here
        for (int i=1; i< N; i++) {
            minFromLeft[i] = Math.min(A[i], minFromLeft[i - 1]);
        }
        
        for (int j=N-2; j>=0; j--) {
            maxFromRight[j] = Math.max(A[j], maxFromRight[j + 1]);
        }
        
        int i=0;
        int j=0;
        int maxDiff = -1;
        
        while (i<N && j<N) {
            if (minFromLeft[i]<=maxFromRight[j]) {
                maxDiff = Math.max(maxDiff,  j-i);
                j++;    
            } else {
                i++;
            }
            
        }
        return maxDiff;
        
    }
}