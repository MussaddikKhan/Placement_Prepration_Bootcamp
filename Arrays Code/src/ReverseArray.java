import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
    static void display(int arr[], int currSize){
        for(int i = 0; i < currSize; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int s = 0;
        int e = arr.length-1;
        display(arr, arr.length);
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        display(arr, arr.length);
    }
}
