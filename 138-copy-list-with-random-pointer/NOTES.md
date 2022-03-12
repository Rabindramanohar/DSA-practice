**Brute force**
* Create the deep copy of original node and store both original and deep copy node inside the map.
* Iterate over the map and assign random to copy nodes as it is in original one. And return head;
```java
class Solution {
Map<Node, Node> hm = new HashMap<>();
public Node copyRandomList(Node head) {
// brute force: T= O(N);
Node newH = getCopy(head);
for(Node key: hm.keySet()) {
Node copy = hm.get(key);
copy.random = hm.get(key.random);
}
return newH;
}
private Node getCopy(Node node) {
if(node == null)
return null;
Node newH = new Node(node.val);
newH.next = getCopy(node.next);
hm.put(node, newH);
return newH;
}
}
```