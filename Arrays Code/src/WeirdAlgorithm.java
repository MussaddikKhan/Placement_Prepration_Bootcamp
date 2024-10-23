import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();

        while(n != 1){
            System.out.print(n + " ");
            if((n&1) == 1) n = n * 3 + 1;
            else n = n / 2;
        }
        System.out.println(n);
    }
}
