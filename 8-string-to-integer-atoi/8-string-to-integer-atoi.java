class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int result = 0;
        int idx = 0;
        int n = s.length();
        while(idx < n && s.charAt(idx) == ' ')
            idx++;
        
        if(idx < n && s.charAt(idx) == '+') {
            sign = 1;
            idx++;
        } else if(idx < n && s.charAt(idx) == '-') {
            sign = -1;
            idx++;
        }
        
        while(idx < n && Character.isDigit(s.charAt(idx))) {
            int digit = s.charAt(idx)-'0';
            if((result > Integer.MAX_VALUE/10) || (result == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            result = 10 *result + digit;
            idx++;
        }
        return sign*result;
    }
}