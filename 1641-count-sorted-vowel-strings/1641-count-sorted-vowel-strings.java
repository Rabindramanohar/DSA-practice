class Solution {
    // combination with repetitions T = O(n)
    public int countVowelStrings(int n) {
        return (n+4)*(n+3)*(n+2)*(n+1) / 24;
    }
}