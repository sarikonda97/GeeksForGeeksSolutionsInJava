class Solution{
    public int digitsInFactorial(int N){
        // code here
         if (N == 0 || N == 1) {
             return 1;
         }
         double digitCount = 0;
         for (int i=2; i<=N;i++) {
             digitCount += Math.log10(i);
         }
         
         return (int) Math.floor(digitCount) + 1;
    }
}