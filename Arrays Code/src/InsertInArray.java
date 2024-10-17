import java.util.Scanner;

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
        }
    }
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,-1,-1,-1}; // -1 represent empty block;
        int arr[] = new int [7];
        Scanner sc =  new Scanner(System.in);
        int currSize = 4;
        int acutalSize = arr.length;
        System.out.println("Enter the values :- ");
        for(int i = 0; i < currSize; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(acutalSize);
        System.out.println("Enter the Index :- ");
        int index = sc.nextInt();

        System.out.println("Enter the Value :- ");
        int value = sc.nextInt();
        
        display(arr, currSize);
        insert(arr, index, value, currSize, acutalSize);
        currSize = currSize + 1;
        display(arr,currSize);
    }
}
