/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackAndQueue;
import stackAndQueue.AnimalShelterPackage.Cat;
import stackAndQueue.AnimalShelterPackage.Dog;
import stackAndQueue.AnimalShelterPackage.Animal;


import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
//    Stack<Integer> myStack = new Stack<Integer>();
//    Queue<Integer> myQueue = new Queue<>();
//    PseudoQueue<Integer> myPseudoQueue = new PseudoQueue<>();
//    @Test public void testPushOntoTheStack() {
//        myStack.push(5);
//        int size = myStack.size;
//        int expectedSize = 1;
//        assertEquals("size must be 1",expectedSize,size);
//        String output = myStack.toString();
//        String expectedOutput = "5\nnull";
//        assertEquals(expectedOutput,output);
//    }
//    @Test public void testPushMultipleValuesOntoTheStack() {
//        myStack.push(3);
//        myStack.push(5);
//        myStack.push(1);
//        int size = myStack.size;
//        int expectedSize = 3;
//        assertEquals("size must be 3",expectedSize,size);
//        String output = myStack.toString();
//        String expectedOutput = "1\n5\n3\nnull";
//        assertEquals(expectedOutput,output);
//    }
//    @Test public void testPopOfTheStack() {
//        myStack.push(3);
//        myStack.push(5);
//        myStack.push(1);
//        int popped = myStack.pop();
//        int size = myStack.size;
//        int expectedSize = 2;
//        assertEquals("size must be 2",expectedSize,size);
//        int expectedOutput = 1;
//        assertEquals(expectedOutput,popped);
//    }
//    @Test public void testEmptyTheStackAfterMultiplePops() {
//        myStack.push(3);
//        myStack.push(5);
//        myStack.push(1);
//        myStack.pop();
//        myStack.pop();
//        myStack.pop();
//        int size = myStack.size;
//        int expectedSize = 0;
//        assertEquals("size must be 0",expectedSize,size);
//        String output = myStack.toString();
//        String expectedOutput = "null";
//        assertEquals(expectedOutput,output);
//    }
//    @Test public void testPeekTheNextItem() {
//        myStack.push(3);
//        myStack.push(5);
//        myStack.push(1);
//        int peeked = myStack.peek();
//        int size = myStack.size;
//        int expectedSize = 3;
//        assertEquals("size must be 3",expectedSize,size);
//        String output = myStack.toString();
//        int expectedOutput = 1;
//        assertEquals(expectedOutput,peeked);
//    }
//    @Test public void testInstantiateAnEmptyStack() {
//        int size = myStack.size;
//        int expectedSize = 0;
//        assertEquals("size must be 0",expectedSize,size);
//        String output = myStack.toString();
//        String expectedOutput = "null";
//        assertEquals(expectedOutput,output);
//    }
//
//    @Test public void testCallingPopOrPeekOnEmptyStack() {
//        assertNull(myStack.peek());
//        assertNull(myStack.pop());
//    }
//
//
//
//    @Test public void testEnqueueIntoAQueue() {
//        myQueue.enqueue(10);
//        int size = myQueue.size;
//        int expectedSize = 1;
//        assertEquals("size must be 1",expectedSize,size);
//    }
//
//    @Test public void testEnqueueMultipleValuesIntoAQueue() {
//        myQueue.enqueue(10);
//        myQueue.enqueue(9);
//        myQueue.enqueue(5);
//        myQueue.enqueue(6);
//        myQueue.enqueue(3);
//        myQueue.enqueue(1);
//        int size = myQueue.size;
//        int expectedSize = 6;
//        assertEquals("size must be 6",expectedSize,size);
//    }
//    @Test public void testDequeueOutOfAQueue() {
//        myQueue.enqueue(10);
//        myQueue.enqueue(9);
//        myQueue.enqueue(5);
//        myQueue.enqueue(6);
//        myQueue.enqueue(3);
//        int value = myQueue.dequeue();
//        int expectedValue = 10;
//        int size = myQueue.size;
//        int expectedSize = 4;
//        assertEquals("size must be 4",expectedSize,size);
//        assertEquals("value must be 10",expectedValue,value);
//    }
//    @Test public void testPeekIntoAQueue() {
//        myQueue.enqueue(10);
//        myQueue.enqueue(9);
//        myQueue.enqueue(5);
//        myQueue.enqueue(6);
//        myQueue.enqueue(3);
//        int value = myQueue.peek();
//        int expectedValue = 10;
//        int size = myQueue.size;
//        int expectedSize = 5;
//        assertEquals("size must be 5",expectedSize,size);
//        assertEquals("value must be 10",expectedValue,value);
//
//    }
//    @Test public void testEmptyAQueueAfterMultipleDequeues() {
//        myQueue.enqueue(10);
//        myQueue.enqueue(9);
//        myQueue.enqueue(5);
//        myQueue.dequeue();
//        myQueue.dequeue();
//        myQueue.dequeue();
//        int size = myQueue.size;
//        int expectedSize = 0;
//        assertEquals("size must be 0",expectedSize,size);
//    }
//
//    @Test public void testInstantiateAnEmptyQueue() {
//        int size = myQueue.size;
//        int expectedSize = 0;
//        assertEquals("size must be 0",expectedSize,size);
//        String output = myQueue.toString();
//        String expectedOutput = "null";
//        assertEquals(expectedOutput,output);
//    }
//
//    @Test public void testCallingDequeueOrPeekOnEmptyQueue() {
//        assertNull(myQueue.peek());
//        assertNull(myQueue.dequeue());
//    }
////    ****************************************************************************
//@Test public void testEnqueueIntoAPseudoQueue() {
//
//    myPseudoQueue.enqueue(10);
//    int size = myPseudoQueue.getSize();
//    int expectedSize = 1;
//    assertEquals("size must be 1",expectedSize,size);
//}
//
//    @Test public void testEnqueueMultipleValuesIntoAPseudoQueue() {
//        myPseudoQueue.enqueue(10);
//        myPseudoQueue.enqueue(9);
//        myPseudoQueue.enqueue(5);
//        myPseudoQueue.enqueue(6);
//        myPseudoQueue.enqueue(3);
//        myPseudoQueue.enqueue(1);
//        int size = myPseudoQueue.getSize();
//        int expectedSize = 6;
//        assertEquals("size must be 6",expectedSize,size);
//    }
//    @Test public void testDequeueOutOfAPseudoQueue() {
//        myPseudoQueue.enqueue(10);
//        myPseudoQueue.enqueue(9);
//        myPseudoQueue.enqueue(5);
//        myPseudoQueue.enqueue(6);
//        myPseudoQueue.enqueue(3);
//        int value = myPseudoQueue.dequeue();
//        int expectedValue = 10;
//        int size = myPseudoQueue.getSize();
//        int expectedSize = 4;
//        assertEquals("size must be 4",expectedSize,size);
//        assertEquals("value must be 10",expectedValue,value);
//    }
//
//    @Test public void testPeekIntoAPseudoQueue() {
//        myPseudoQueue.enqueue(10);
//        myPseudoQueue.enqueue(9);
//        myPseudoQueue.enqueue(5);
//        myPseudoQueue.enqueue(6);
//        myPseudoQueue.enqueue(3);
//        int value = myPseudoQueue.peek();
//        int expectedValue = 10;
//        int size = myPseudoQueue.getSize();
//        int expectedSize = 5;
//        assertEquals("size must be 5",expectedSize,size);
//        assertEquals("value must be 10",expectedValue,value);
//
//    }
//    @Test public void testEmptyAPseudoQueueAfterMultipleDequeues() {
//        myPseudoQueue.enqueue(10);
//        myPseudoQueue.enqueue(9);
//        myPseudoQueue.enqueue(5);
//        myPseudoQueue.dequeue();
//        myPseudoQueue.dequeue();
//        myPseudoQueue.dequeue();
//        int size = myPseudoQueue.getSize();
//        int expectedSize = 0;
//        assertEquals("size must be 0",expectedSize,size);
//    }
//
//    @Test public void testInstantiateAnEmptyPseudoQueue() {
//        int size = myPseudoQueue.getSize();
//        int expectedSize = 0;
//        assertEquals("size must be 0",expectedSize,size);
//        String output = myPseudoQueue.toString();
//        String expectedOutput = "null";
//        assertEquals(expectedOutput,output);
//    }
//
//    @Test public void testCallingDequeueOrPeekOnEmptyPseudoQueue() {
//        assertNull(myPseudoQueue.peek());
//        assertNull(myPseudoQueue.dequeue());
//    }
@Test public void testCreateEmptyAnimalShelter() {
    AnimalShelter animalShelter = new AnimalShelter();
    assertEquals("null",animalShelter.toString());
}
    @Test public void testEnqueueAnimalsToTheShelter() {
        AnimalShelter animalShelter = new AnimalShelter();
        Dog d2 = new Dog("dog number 2");
        Dog d3 = new Dog("dog number 3");
        Cat c1 = new Cat("cat number 1");
        Cat c2 = new Cat("cat number 2");
        animalShelter.enqueue(d2);
        animalShelter.enqueue(d3);
        animalShelter.enqueue(c1);
        animalShelter.enqueue(c2);
        String expected ="dog number 2 -- dog number 3 -- cat number 1 -- cat number 2 -- null";
        assertEquals(expected,animalShelter.toString());
    }
    @Test public void testDequeuePrefCat() {
        AnimalShelter animalShelter = new AnimalShelter();
        Dog d2 = new Dog("dog number 2");
        Dog d3 = new Dog("dog number 3");
        Cat c1 = new Cat("cat number 1");
        Cat c2 = new Cat("cat number 2");
        animalShelter.enqueue(d2);
        animalShelter.enqueue(d3);
        animalShelter.enqueue(c1);
        animalShelter.enqueue(c2);
        Animal value = animalShelter.dequeue("cat");
        String expected ="dog number 2 -- dog number 3 -- cat number 2 -- null";
        assertEquals(expected,animalShelter.toString());
        assertEquals("cat number 1",value.name);

    }
    @Test public void testDequeuePrefDog() {
        AnimalShelter animalShelter = new AnimalShelter();
        Dog d2 = new Dog("dog number 2");
        Dog d3 = new Dog("dog number 3");
        Cat c1 = new Cat("cat number 1");
        Cat c2 = new Cat("cat number 2");
        animalShelter.enqueue(d2);
        animalShelter.enqueue(d3);
        animalShelter.enqueue(c1);
        animalShelter.enqueue(c2);
        Animal value = animalShelter.dequeue("dog");
        String expected ="dog number 3 -- cat number 1 -- cat number 2 -- null";
        assertEquals(expected,animalShelter.toString());
        assertEquals("dog number 2",value.name);
    }
    @Test public void testDequeuePrefCatNotFound() {
        AnimalShelter animalShelter = new AnimalShelter();
        Dog d2 = new Dog("dog number 2");
        Dog d3 = new Dog("dog number 3");
        animalShelter.enqueue(d2);
        animalShelter.enqueue(d3);
        Animal value = animalShelter.dequeue("cat");
        String expected ="dog number 2 -- dog number 3 -- null";
        assertEquals(expected,animalShelter.toString());
        assertNull(value);
    }
    @Test public void testDequeuePrefAnyThingAnotherCatOrDog() {
        AnimalShelter animalShelter = new AnimalShelter();
        Dog d2 = new Dog("dog number 2");
        Dog d3 = new Dog("dog number 3");
        animalShelter.enqueue(d2);
        animalShelter.enqueue(d3);
        Animal value = animalShelter.dequeue("panda");
        String expected ="dog number 2 -- dog number 3 -- null";
        assertEquals(expected,animalShelter.toString());
        assertNull(value);
    }
}