import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TwoDimArray {
    static  void display(int [][] newArr){
        for(int i = 0; i < newArr.length; i++){    // 3;
            for(int j = 0; j < newArr[0].length; j++){
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] newArr = {{1,2,3}, {5,0,6}, {2, 1, 3}, {4, 5, 6}};
        newArr[0][1]  = 1;
//        Scanner sc = new Scanner(System.in);
        int rowSize = newArr.length;

        System.out.println(rowSize);
        int colSize = newArr[0].length;
        System.out.println(colSize);
        display(newArr);
        Arrays.sort(newArr, (a, b) -> Integer.compare(a[0], b[0]));    // pending
        display(newArr);

    }
}
