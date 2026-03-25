class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String orgi = String.valueOf(x);
        String rev = new StringBuilder(orgi).reverse().toString();
        return orgi.equals(rev);
        
    }
}