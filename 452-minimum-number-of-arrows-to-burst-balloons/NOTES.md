**Intuition** : If we sort the 2d array with last element and then compare with first element of the array, if greater than last element increase the arrow by one else not. Repeat this till the end of the given array of ballons
**Steps**
* Sort the given array with last element
* create 2 variables: arrow and end to store the arrow count and current last element value repectively
* loop throught the given array and keep on checking the current last element greater or not, if yes then increase the arrow by one and change the end value to current last element.
* then return the count arrows;