**algo**
* approach is recursion
* helper method, start loop from idx - n-1 and check isPalindrom valid;
* If palindrom is valid then add substring(idx-i) in curr list. Repeat this by using recursive call with idx+1.
* Bracktrack to get the right side remaing partition by removing last character.
* BaseCase: if idx == n, then add it to ans list and return;