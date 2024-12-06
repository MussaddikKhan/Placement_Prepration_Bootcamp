public class CountDigitNumber
{
    public static void main(String[] args) {
        int num = 123456;
        int digitCount = 0;
        while(num > 0){
            int lastDigit = num % 10;
            digitCount = digitCount + 1; //digitCunt++;
            num  = num / 10; // num /= 10;
        }
        System.out.println(digitCount);

    }
}
