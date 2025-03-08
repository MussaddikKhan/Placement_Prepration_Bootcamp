import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class SortString {

    public static void main(String[] args) {
        String s = "leetcode";
        char arr[] = s.toCharArray();

//        for(int i = 0; i < s.length(); i++){
//              arr[i] = s.charAt(i);
//        }
        // toString();
        // Descending
        Comparator<Character>comp = new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if(o1.compareTo(o2) < 0)return  1;
                return -1;
            }
        };
        Arrays.sort(arr);

        s =  new String(arr);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//            s += arr[i];
//        }

        System.out.println(s);
    }
}
