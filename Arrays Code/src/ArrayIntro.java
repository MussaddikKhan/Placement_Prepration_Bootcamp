public class ArrayIntro {
    public static void main(String[] args) {
//        int a[] = {1,2,3,4,5};
//         int a[] = new int[5];    // First
//         int []b=  new int[5];    // second;

        int a[] = new int [5];
        a[0] = 6;
        a[1] = 7;
//        a[2] = 7;
//        a[3] = 7;
//        a[4] = 7;
        System.out.println(a[0]);
        System.out.println(a[1]);

        for(int i= 0; i < 2;i++){
            System.out.print(a[i] + " ");
        }
    }
}
