/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertionSort;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        int[] array = {8,4,23,42,16,15};
        int[] array2 = {20,18,12,8,5,-2};//Reverse-sorted array (this will take the biggest  number of iteration)
        int[] array3 = {5,12,7,5,5,7};//Few uniques
        int[] array4 = {2,3,5,7,13,11};//Nearly-sorted
        System.out.println(Arrays.toString(InsertionSort.insertionSort(array)));
        System.out.println(Arrays.toString(InsertionSort.insertionSort(array2)));
        System.out.println(Arrays.toString(InsertionSort.insertionSort(array3)));
        System.out.println(Arrays.toString(InsertionSort.insertionSort(array4)));
    }
}
