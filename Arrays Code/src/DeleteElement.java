public class DeleteElement {
    static void display(int arr[], int currSize){
        for(int i = 0; i < currSize; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void delete(int arr[], int currSize,int actualSize, int index){
        if(index < 0 || index >= actualSize) {
            System.out.println("Index is Invalid");
        }
        else{
            for(int i = index + 1 ; i < actualSize; i++){
                arr[i-1] = arr[i]; 
            }
            arr[currSize - 1] = -1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int index = 1;
        int currSize = arr.length;
        int actualSize = arr.length;
        display(arr, currSize);
        delete(arr, currSize, actualSize, index);
        currSize = currSize - 1;
        display(arr, currSize);
    }
}
