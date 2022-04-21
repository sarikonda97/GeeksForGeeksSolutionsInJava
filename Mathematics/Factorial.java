class Solution {

    public long factorial(int N) {
        // Your code here
        long fact=1;
        for (int i=2; i<=N; i++)
        {
            fact*=i;
        }
        return fact;
    }
}