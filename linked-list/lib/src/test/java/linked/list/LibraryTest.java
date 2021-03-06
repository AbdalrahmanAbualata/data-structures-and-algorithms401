/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    LinkedList testList = new LinkedList();

    @Test
    public void testEmptyLinkedList() {
        String output = testList.toString();
        assertEquals( "NULL", output,"Must be NULL");
    }
    @Test
    public void testInsertToList() {
        testList.insert(7);
        String output = testList.toString();
        assertEquals( " { 7 } --> NULL", output,"Must be { 7 } --> Null");
    }

    @Test
    public void testHeadValue() {
        testList.insert(7);
        Object output = testList.head.value;
        assertEquals( 7, output,"Must be 7");
    }

    @Test
    public void testInsertMultipleToList() {
        testList.insert(7);
        testList.insert(6);
        testList.insert(5);
        testList.insert(4);
        String output = testList.toString();
        String expected = " { 4 } -->  { 5 } -->  { 6 } -->  { 7 } --> NULL";
        assertEquals( expected, output,"Must be  { 4 } -->  { 5 } -->  { 6 } -->  { 7 } --> NULL");
    }

    @Test
    public void testIncludeExistValue() {
        testList.insert(7);
        testList.insert(8);
        testList.insert(9);
        boolean isFound = testList.includes(8);
        assertTrue( isFound,"Must be true");
    }

    @Test
    public void testNotIncludeValue() {
        testList.insert(7);
        testList.insert(8);
        testList.insert(9);
        boolean isNotFound = testList.includes(5);
        assertFalse( isNotFound,"Must be False");
    }
    @Test
    public void testRuternAllValueInList() {
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        String output = testList.toString();
        String expected = " { 4 } -->  { 3 } -->  { 2 } -->  { 1 } --> NULL";
        assertEquals( expected,output,"Must be   { 4 } -->  { 3 } -->  { 2 } -->  { 1 } --> NULL");
    }
    @Test public void testAddToTheEnd(){
        testList.insert(7);
        testList.append(10);
        testList.append(11);
        testList.append("im the final one");
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { 11 } -->  { im the final one } --> NULL";
        assertEquals(expected,output);
    }
    @Test public void testInsertBeforeTheMiddleValue(){
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertBefore(11,"im the middle value");
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { im the middle value } -->  { 11 } -->  { 12 } --> NULL";
        assertEquals(expected,output);
    }
    @Test public void testInsertBeforeTheFirstValue(){
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertBefore(7,"im the middle value");
        String output = testList.toString();
        String expected = " { im the middle value } -->  { 7 } -->  { 10 } -->  { 11 } -->  { 12 } --> NULL";
        assertEquals(expected,output);
    }
    @Test public void testInsertAfterTheMiddleValue(){
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertAfter(11,"after thr middle");
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { 11 } -->  { after thr middle } -->  { 12 } --> NULL";
        assertEquals(expected,output);
    }
    @Test public void testInsertAfterTheLastValue(){
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertAfter(12,"after thr lastValue");
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { 11 } -->  { 12 } -->  { after thr lastValue } --> NULL";
        assertEquals(expected,output);
    }
    //*********************************************************************************
    // code chalege 07
    @Test
    public void testKthFromEndWhen_K_isGraterThanTheLengthOfList() {
        testList.insert(5);//the first element (head)
        testList.append(6);
        testList.append(7);
        testList.append(8);
        int output = testList.kthFromEnd(5);
        int expected = -1;
        assertEquals( expected, output,"The output must be -1");
    }

    @Test
    public void testKthFromEndWhen_K_isEqualToTheLengthOfList() {
        testList.insert(5);//the first element (head)
        testList.append(6);
        testList.append(7);
        testList.append(8);
        int output = testList.kthFromEnd(4);
        int expected = -1;
        assertEquals( expected, output,"The output must be -1");
    }

    @Test
    public void testKthFromEndWhen_K_isNegativeNumber() {
        testList.insert(5);//the first element (head)
        testList.append(6);
        testList.append(7);
        testList.append(8);
        int output = testList.kthFromEnd(-4);
        int expected = -1;
        assertEquals( expected, output,"The output must be -1");
    }

    @Test
    public void testKthFromEndWhenTheSizeOfTheListIsOne() {
        testList.insert(7);//the first element (head)
        int output = testList.kthFromEnd(0);
        int expected = 7;
        assertEquals( expected, output,"The output must be 7");
        output = testList.kthFromEnd(1);
        expected = -1;
        assertEquals( expected, output,"The output must be -1");
    }

    @Test
    public void testKthFromEndWhen_K_InTheMiddleOfTheList() {
        testList.insert(7);//the first element (head)
        testList.append(5);
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.append(9);
        testList.append(10);
        int output = testList.kthFromEnd(5);
        int expected = 5;
        assertEquals( expected, output,"The output must be 5");
        output = testList.kthFromEnd(3);
        expected = 7;
        assertEquals( expected, output,"The output must be 7");
    }
//    ******************************************************************
    // code chalege 08

    @Test public void testZipLists() {
        LinkedList testList1 = new LinkedList();
        LinkedList testList2 = new LinkedList();
        testList1.insert(10);
        testList1.insert(9);
        testList1.insert(8);
        testList1.insert(4);
        testList2.insert(14);
        testList2.insert(7);
        testList2.insert(22);
        LinkedList newList = LinkedList.zipLists(testList1, testList2);
        String expected = " { 4 } -->  { 22 } -->  { 8 } -->  { 7 } -->  { 9 } -->  { 14 } -->  { 10 } --> NULL";
        String output = newList.toString();
        assertEquals(expected, output);

        int expectedSize = 7;
        int actualSize = newList.getSize();
        assertEquals( expectedSize, actualSize,"Size must be 7");
    }

    @Test
    public void testZipListsWithSizeZeroForOneOfTheLists() {
        LinkedList testList1 = new LinkedList();
        LinkedList testList2 = new LinkedList();

        testList2.insert(14);
        testList2.insert(7);
        testList2.insert(22);
        LinkedList newList = LinkedList.zipLists(testList1, testList2);
        String expected = " { 22 } -->  { 7 } -->  { 14 } --> NULL";
        String output = newList.toString();
        assertEquals(expected, output);

        int expectedSize = 3;
        int actualSize = newList.getSize();
        assertEquals( expectedSize, actualSize,"Size must be 3");
    }

    @Test
    public void testZipListsWithSizeZeroForTheLists() {
        LinkedList testList1 = new LinkedList();
        LinkedList testList2 = new LinkedList();

        LinkedList newList = LinkedList.zipLists(testList1, testList2);
        String expected = "NULL";
        String output = newList.toString();
        assertEquals(expected, output);

        int expectedSize = 0;
        int actualSize = newList.getSize();
        assertEquals( expectedSize, actualSize,"Size must be 0");
    }


}
