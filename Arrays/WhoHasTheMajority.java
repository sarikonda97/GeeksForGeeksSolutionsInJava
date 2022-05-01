class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int decider = 0;
        n-=1;
        while (n>=0) {
            if (arr[n] == x) {
                ++ decider;
            } else if (arr[n] == y) {
                --decider;
            }
            --n;
        }
        if (decider < 0) {
            return y;
        } else if (decider > 0) {
            return x;
        } else {
            return Math.min(x,y);
        }
    }
}