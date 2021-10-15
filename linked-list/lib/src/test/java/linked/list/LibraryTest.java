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
}
