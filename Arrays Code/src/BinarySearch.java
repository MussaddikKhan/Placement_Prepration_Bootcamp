public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int start = 0;
        int end = arr.length - 1;
        int key = 9;
        int idx = -1;
        while (start <= end) {
            int mid = (start + end) / 2;  // start + (end - start)/2;
            if (arr[mid] == key) {
                idx = mid;
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (idx == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + idx);

        }
    }
}
