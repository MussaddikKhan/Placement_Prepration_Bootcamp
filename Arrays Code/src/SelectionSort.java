public class SelectionSort {
    static void display(int arr[], int currSize){
        for(int i = 0; i < currSize; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static  void selectionSort(int arr[], int size){
          for(int i = 0; i < size; i++){
              int minIndex = i;
              for(int j = i +1; j < size; j++){
                  if(arr[minIndex] > arr[j])minIndex = j;
              }
              int temp = arr[i];
              arr[i] =  arr[minIndex];
              arr[minIndex] = temp; 
          }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,3};
        int n = arr.length;
        System.out.println("Array Before Selection Sort");
        display(arr, n);
        selectionSort(arr, n);
        System.out.println("Array After Selection Sort");
        display(arr, n);

    }
}
