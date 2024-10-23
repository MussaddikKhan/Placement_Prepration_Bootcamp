public class BubbleSort
{
    static void display(int arr[], int currSize){
        for(int i = 0; i < currSize; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int arr[], int size){
        boolean isSorted = true;
        for(int i = 0; i < size; i++){
            for(int j = 0;j < size - i - 1; j++){
                if(arr[j] > arr[j+1])  {   // -> sorted nhi hai
                    isSorted = false; 
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(isSorted == true)break;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0};
        System.out.println("BEFORE SORTING....");
        display(arr, arr.length);
        bubbleSort(arr, arr.length);
        System.out.println("AFTER SORTING ");
        display(arr, arr.length);
    }
}
