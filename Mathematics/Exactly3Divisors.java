class Solution
{
    public static boolean isPrime(int num) 
    {
        if (num == 1) {
            return false;
        }
        else if (num == 2 || num ==3) {
            return true;
        }
        else if (num%2 == 0 || num%3 == 0) {
            return false;
        }
        for(int i=5; i*i<=num; i=i+6) {
            if (num%i == 0 || num%(i+2) == 0) {
                return false;
            }
        }
        return true;
    }
        
    public int exactly3Divisors(int N)
    {
        //Your code here
        int count=0;
        for(int j=2; j*j<=N; j++)
        {
            if (isPrime(j)) {
                if (j*j<=N) {
                    ++count;
                }
            }
        }
        return count;
    }
}