class Solution {
    public boolean isPerfectSquare(int num) {
        int m= (int)Math.sqrt(num);
        if (m*m==num)return true;
        else return false;
    }
}