class Solution {
    public static long sumUnderModulo(long a, long b){
        // code here
        long M=(long) Math.pow(10,9)+7;
        return (a%M+b%M)%M;
    }   
}