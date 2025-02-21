public class StringMethods {
    public static void main(String[] args) {
        String s = "Hellow";
        String str = new String("Hellow");
        if(s.equals(str)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are diff");
        }
        System.out.println(s.substring(1, 3));
        s = s.concat(" World");
        s = s +  " Java"; 
        System.out.println(s);
        if(s.indexOf("hii") != -1){
            System.out.println("World is Present in String");
        }
        else{
            System.out.println("Not Present");
        }
        String a  = "cde";
        String b = "abc";
        if(a.compareTo(b) == 0){
            System.out.println("Both are equal");
        }
        else if(a.compareTo(b) < 0){
            System.out.println("First is smaller tha second");
        }
        else{
            System.out.println("First is Greatre than second");
        }
        s = "                  hiii   ";
        s = s.trim();
        s = s.replace('h', 'H');
        s = "hello word";
        if(s.indexOf("hello", 1) == -1){
            System.out.println("substr is not present");
        }
        System.out.println(s);
        
  
    }
}
