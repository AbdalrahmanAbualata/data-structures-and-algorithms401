# Challenge Summary
* Implement a method to find the max value of a binary tree.
* Need add the following method:
    * finMaximumValue(root) this method should return an integer number which is the max value of the tree.

## Whiteboard Process
![Whiteboard](./cc%20img%2016.png)

## Approach & Efficiency
***find-maximum-value***

**Apply the DFS to find the max value :**

* start from the root,findMax(root)
* set the max vlue is the root
* if the root is a leaf, `return` the value of the root.
* else,
  * if the root has left child => left = findMax(root.left)
  * if the root has right child => right = findMax(root.right)
  * if the left value > max => max = left
  * if the right value > max => max = right
  * return max value
### Big o 
  - **of time** = O(N) where N is the number  of the Node in the tree .
  - **of space** =O(H) where H is the high of the stack
## Solution
[source code](../lib/src/main/java/trees/BinaryTree.java)

