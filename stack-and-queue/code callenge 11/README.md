# Challenge Summary
Implement a queue using two stacks only with methods of( pop, push, peek)
* Need add the following methods:
* dequeue() this method should retrieve the first element of the queue (front).
* enqueue(value) this method should add the value to the end of the queue (rear).

## Whiteboard Process
[Whiteboard](./cc11.png)

## Approach & Efficiency
* create a class (PseudoQueue)
* create two stacks , primary and secondary one. when a PseudoQueue is instaniated.
* declare two main methods..(enqueue, dequeue)
* Enqueue method:
    * just push into the primary stack.
* dequeue method:
    * move the contents of the primary stack to the secondary one.
    * pop the top value from the secondary stack
    * move the contents from the secondary stack to the primary one
    * return the poped value.

#### Big O :-
* enqueue() :-Time & Space O(1)
* dequeue() :-Time & spaceO(n)

## Solution
[code](../lib/src/main/java/stackAndQueue/PseudoQueue.java)
