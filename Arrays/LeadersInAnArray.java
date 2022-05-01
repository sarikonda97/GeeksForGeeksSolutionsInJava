class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        Stack<Integer> st = new Stack<Integer>();
        int max = arr[n-1];
        st.push(arr[n-1]);
        for (int i=n-2; i>=0; i--) {
            if (arr[i]>=max) {
                max=arr[i];
                st.push(arr[i]);
            }
        }
        ArrayList<Integer> stackToList = new ArrayList<Integer>(st);
        Collections.reverse(stackToList);
        
        return stackToList;
    }
}