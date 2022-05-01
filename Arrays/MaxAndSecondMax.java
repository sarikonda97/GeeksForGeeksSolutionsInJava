class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int max=-1, secondMax=-1;
        for (int i=0; i<sizeOfArray; i++) {
            if (arr[i] > max) {
                secondMax=max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] < max ) {
                secondMax = arr[i];
            }
        }
        
        return new ArrayList<Integer>(Arrays.asList(max, secondMax));
    }
}