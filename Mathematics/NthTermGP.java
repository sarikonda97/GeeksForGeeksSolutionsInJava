class Solution
{   
    public double termOfGP(int A,int B,int N)
    {
        return A*Math.pow((double) B/A, N-1);
        //Your code here
    }
}