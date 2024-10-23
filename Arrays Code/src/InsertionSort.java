public class InsertionSort {
    static void display(int arr[], int currSize){
        for(int i = 0; i < currSize; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static  void insertionSort(int arr[], int size){
        for(int i = 1; i < size; i++){
            int element = arr[i];
            int j = i - 1;
            while(j >= 0){
                if(arr[j] <= element)break;
                else arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = element;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,3};
        int n = arr.length;
        System.out.println("Array Before Insertion Sort");
        display(arr, n);
        insertionSort(arr, n);
        System.out.println("Array After Insertion Sort");
        display(arr, n);

    }
}
