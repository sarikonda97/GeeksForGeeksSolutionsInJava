class Solution
{
    static long multiplicationUnderModulo(long a, long b)
    {
        // add your code here
        long M=(long) (Math.pow(10,9) + 7);
        return ((a%M)*(b%M))%M;
    }
}