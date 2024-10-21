public class PrintOddTCS {
    public static void main(String[] args) {
        int n = 15;

        for(int i = 1; i <= n; i++){
           if(i > 9){
               int num = i;
               int sum = 0;
               while(num > 0){
                   sum += (num % 10);
                   num = num / 10;
               }
               if((sum % 2 ) == 1) System.out.print(i + " ");
           }
           else{
               if((i % 2 ) == 1)System.out.print(i + " ");
           }
        }
    }
}
