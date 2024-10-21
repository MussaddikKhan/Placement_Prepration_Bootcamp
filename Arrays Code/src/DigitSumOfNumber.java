public class DigitSumOfNumber {
    public static void main(String[] args) {
        int num = 123456;

        while(num != 0){
            int dig = num % 10;
            System.out.print("Digit " + dig);
            num = num / 10;
            System.out.println(" Next Number " + num);
        }
    }
}
