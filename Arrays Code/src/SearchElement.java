import java.util.Scanner;

public class SearchElement {

    static  boolean search(int arr[], int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // size of array
        int x = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = search(arr, x);  // ans = true / false;
        if(ans == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
