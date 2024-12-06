public class UpperBound {
    static int upperBound(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int idx = -1;
        while (start <= end) {
            int mid = (start + end) / 2;  // start + (end - start)/2;
            if (arr[mid]  >  key) {
                idx = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7};
        int idx = upperBound(arr, 2);
        System.out.println(idx + " " + arr[idx]);
    }
}

             
