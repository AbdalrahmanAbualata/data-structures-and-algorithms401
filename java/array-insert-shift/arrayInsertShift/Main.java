package arrayInsertShift;

public class Main {
    public static void main(String[] args) {
        String greeting = "Welcome to my Java program.";
        System.out.println(greeting);
        int[] array={42,8,15,23,42};
        System.out.println(insertShiftArray(array,5));
    }

    public static int[] insertShiftArray(int[] arr , int newElement){
        int[] newArray = new int[arr.length+1];
        int leftPointer = 0;
        int rightPointer=newArray.length-1;

        while (leftPointer < rightPointer) {

            newArray[leftPointer] = arr[leftPointer];
            newArray[rightPointer] = arr[rightPointer-1];
            leftPointer++;
            rightPointer--;

        }
        newArray[leftPointer] = newElement;

        return newArray;
    }
}