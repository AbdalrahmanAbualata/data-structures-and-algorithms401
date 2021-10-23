[code](stack-and-queue/lib/src/main/java/stackAndQueue)
# Stacks and Queues
This app must implement the Stack and Queue data structures.

## Challenge
implement the methods related to manipulate a stack and queue successfully with any type of elements inside them.
## Approach & Efficiency
* create a Node class which take a value (whatever its type ) and the next properties.
* create a stack class and add the required and the appropriate methods to it.
* add the top and size fields to the stack .. top will always pointing to the top values of the stack
* if the stack was empty.. the top will point on null.
* create a queue class and add the required and the appropriate methods to it.
* add the front, rear, and size field to this class..
* front will pointing on the oldest element entered the queue and the rear will pointin on the newest one.
* When dequeue from the stack will return the front element.
* when enqueue to the stack will add as a rear element.
###Big o
####SPACE AND TIME THE SAEM
* isEmpty() O(1)
* push() O(1)
* POP() O(1)
* enqueue() O(1)
* dequeue() O(1)
* peek() O(1

## API
### stack
* isEmpty() function to check if stack is empty or not.
* push() function that take an value as input then insert it on top of stack.
* pop() function that delete the node on the top and return the oldest value of top.
* peek() function that print the value in the top of stack.
### queue
* isEmpty() function to check if Queue is empty or not.
* enqueue() function that take an value as input then insert it on rear if not empty,else will add it as front of Queue.
* dequeue() function that delete the node on the front of the queue and return the value that was in the front.
* peek() function that print the value of front.