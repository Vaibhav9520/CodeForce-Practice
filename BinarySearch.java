public class BinarySearch {

    public static void BinarySearch(int[] arr, int low, int high, int key) {
        if (low > high) {
            System.out.println("Element not found");
            return;
        }
        int mid = low + (high - low) / 2;

        if (arr[mid] == key) {
            System.out.println("Element found at index: " + mid);
            return;
        } else if (arr[mid] > key) {
            BinarySearch(arr, low, mid - 1, key);
        } else {
            BinarySearch(arr, mid + 1, high, key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16,22, 27, 30, 35, 40};
        BinarySearch(arr, 0, arr.length - 1, 2);
    }
}
