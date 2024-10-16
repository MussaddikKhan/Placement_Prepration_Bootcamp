public class InsertInArray {
    static void display(int arr[], int currSize){
        for(int i = 0; i < currSize; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void insert(int []arr, int index, int value, int currSize, int actualSize){
        if(index < 0 || index >= actualSize){
            System.out.println("The index is invalid");
        }
        else{
            for(int i = currSize; i >= index; i--){
                arr[i+1] =   arr[i];
            }
            arr[index] = value;
            currSize = currSize + 1;
            display(arr, currSize);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-1,-1,-1}; // -1 represent empty block;
        int acutalSize = arr.length;
        System.out.println(acutalSize);
        int currSize = 4;

        int index = 1;
        int value = 5;
        display(arr, currSize);
        insert(arr, index, value, currSize, acutalSize);
    }
}
