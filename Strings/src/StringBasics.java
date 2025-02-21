public class StringBasics {
    public static void main(String[] args) {
//         char cArr[] = new char[5];

      /**  String s = "Hellow";  // using literals
        String str = new String(("Hellow"));
        System.out.println(s);
        System.out.println(str);
        String s1 = "Hello";
        String s2 = "Hello";
        if(s1 == s2) System.out.println("Both are same"); // == or equals 
        else System.out.println("Both are diff");

        String a = new String("Hello");
        String b = new String("Hello");

        if(a == b) System.out.println("Both are same");
        else System.out.println("Both are diff");
       */ 
          // Hi how are          you ? 
        char cArr[] = {'H', 'e', 'l', 'l', 'o'};
        cArr[0] = 'h';
        for (int i = 0; i < cArr.length; i++) {
            System.out.print(cArr[i]);
        }
        System.out.println();
        String s = "hello World";
        System.out.println("Size of String" + " " + s.length());
        //[] array
        System.out.println(s.charAt(0));
//        s[0] = 'H';
        System.out.println(s);
        String small = "hello";
        String Captial = "HELLO";

        for(int i = 0; i < small.length(); i++){
            System.out.print((char)(small.charAt(i) - 'a' + 'A'));

        }
        System.out.println();
        for(int i = 0; i < Captial.length(); i++){
            System.out.print((char)(Captial.charAt(i) - 'A' + 'a'));
        }
        System.out.println();
        small = small.toUpperCase();       // not working why ?
        System.out.println(small);
        Captial = Captial.toLowerCase();
        System.out.println(Captial);


    }
}
