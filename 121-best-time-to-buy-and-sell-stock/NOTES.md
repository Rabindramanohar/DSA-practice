**Intuition**
* Inside the loop first find the min
* with max variable update max with current ele - min value;
​
**Kadane's Algorithm approach**
* with 2 variables maxCur and max with
* maxCur contains Kadane algo: maxCur = prices[i]-prices[i-1], after this if maxCur val is -ve then initialize maxCur = 0;
* else add maxCur commulatively
​