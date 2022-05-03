class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Set<Integer> numSet = new HashSet<Integer>();
        for (int i=0; i<size; i++) {
            if (arr[i] >= 0) {
                numSet.add(arr[i]);
            }
        }
        for (int j=1; j<Math.pow(10, 6); j++) {
            if (!numSet.contains(j)) {
                return j;
            }
        }
        return 0;
    }
}