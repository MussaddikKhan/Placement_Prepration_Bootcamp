import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
//        arr.add(1);
//        arr.add(2);
//        arr.add(2);
//        arr.add(4);
//        arr.add(5);
//        arr.add(2, 3);
//        arr.remove(3);
//        System.out.println(arr.indexOf(3));
//        arr.addFirst(5);

//        System.out.println(arr.subList(0, 4));
//        for(int i = 0;  i < arr.size(); i++){
//            System.out.print(arr.get(i) + " ");
//        }
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(arr);
    }
}
