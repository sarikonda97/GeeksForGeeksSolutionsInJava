class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> roots = new ArrayList<>();
        int d = (int) (Math.pow(b,2)-(4*a*c));
        int firstFactor = (int) Math.floor((-b+Math.sqrt(d))/(2*a));
        int secondFactor = (int) Math.floor((-b-Math.sqrt(d))/(2*a));
        if (d<0) {
            roots.add(-1);
        }
        else {
            roots.add(Math.max(firstFactor, secondFactor));
            roots.add(Math.min(firstFactor, secondFactor));
        }
        return roots;
    }
}