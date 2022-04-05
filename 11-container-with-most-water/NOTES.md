**Brute force T=O(n*n) with 2 loops **
```
class Solution {
// brute force T = O(n*n);
public int maxArea(int[] height) {
int max = 0;
int n = height.length;
for(int i=0; i<n-1; i++) {
for(int j=i+1; j<n; j++) {
max = Math.max(max, ((j-i) * Math.min(height[i], height[j])));
}
}
return max;
}
}
```
​
​
​
​
​
​
​
in abo