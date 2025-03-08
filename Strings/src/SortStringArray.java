import java.util.Arrays;
import java.util.Comparator;

public class SortStringArray {
    public static void main(String[] args) {
        String arr[] = {"aaf", "aam", "aac"};
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println();
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
        Arrays.sort(arr, comp);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
