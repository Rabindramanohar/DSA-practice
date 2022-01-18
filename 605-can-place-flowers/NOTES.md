**steps**
* run loop from 1 to flowerbed.length-2 and check i+1, i-1 and i are equals to 0 or not if yes then fill flowerbed[i] with 1 and decrement the n value
* then check n equal to 0. if yes return true;
* edge cases: if n==0 return true, flowerbed.length == 1, n==1, i=0. return true;
* else return false;
​
```java
class Solution {
public boolean canPlaceFlowers(int[] flowerbed, int n) {
if(n==0) return true;
if(flowerbed.length == 1 && n==1 && flowerbed[0] == 0) return true;
if(flowerbed[0] == 0) {
if(flowerbed[1] == 0) {
flowerbed[0] = 1;
n--;
}
if(n == 0) return true;
}
if(flowerbed[flowerbed.length-1] == 0) {
if(flowerbed[flowerbed.length-2] == 0) {
flowerbed[flowerbed.length-1] = 1;
n--;
}
if(n==0) return true;
}
for(int i=1; i<flowerbed.length-1; i++) {
if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0 && flowerbed[i] == 0) {
flowerbed[i] = 1;
n--;
}
if(n==0)
return true;
}
return false;
}
}```