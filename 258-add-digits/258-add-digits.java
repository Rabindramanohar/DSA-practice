class Solution {
    public int addDigits(int num) {
        int modifiedDigit = 0;
        while(num > 0) {
            modifiedDigit += num % 10;
            num /= 10;
            
            if(num == 0 && modifiedDigit > 9) {
                num = modifiedDigit;
                modifiedDigit = 0;
            }
        }   
        return modifiedDigit;
    }
}