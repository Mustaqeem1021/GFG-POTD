class Solution {
    long findNth(long n) {
        // code here
        String res = "";
        while( n > 0 ){
            long rem = n % 9 ;
            n /= 9;
            res = rem + res;
        }
        return Long.parseLong(res);
    }
}

