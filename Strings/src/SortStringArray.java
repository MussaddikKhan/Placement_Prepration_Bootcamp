import java.util.Arrays;
import java.util.Comparator;

public class SortStringArray {
    public static void main(String[] args) {
        String arr[] = {"aaf", "aam", "aac"};
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println();
        Comparator<String> comp= new Comparator<String>(){    //Anonymous Inner Class
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(1) == o2.charAt(1)) {
                    if(o1.charAt(2) < o2.charAt(2)) return 1;
                    return -1;
                }
                else if(o1.charAt(1) > o2.charAt(1))return 1;
                else return -1;
            }
        };
        Arrays.sort(arr, comp);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
