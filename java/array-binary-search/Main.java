package arrayInsertShift;

public class BinarySearch {
    public int binarySearch(int[] arr, int element) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        int index = -1;
        while (low <= high) {
            if (arr[mid] > element) {
                high = mid - 1;
            } else if (arr[mid] < element) {
                low = mid + 1;
            } else {
                index = mid;
                return index;
            }

            mid = (low + high) / 2;
        }
        return -1;

    }

}