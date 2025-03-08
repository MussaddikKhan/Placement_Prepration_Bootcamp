import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Pair{
    char ch;
    int freq;
    Pair(int freq, char ch){ // constructor
        this.ch = ch;
        this.freq = freq;
    }
}
public class SortCharFreq {
    public static void main(String[] args) {
       String s = "tree";
       int freq[]  = new int[62];
       for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           if (ch >= 'A' && ch <= 'Z') {
               int idx = ch - 'A'; // 0 - 25;
               freq[idx]++;
           } else if (ch >= 'a' && ch <= 'z') {
               int idx = ch - 'a' + 26; // 26 - 51
               freq[idx]++;
           } else {
               int idx = ch - '0' + 52; // 52 - 61
               freq[idx]++;
           }
       }
       ArrayList<Pair> p = new ArrayList<>();
       for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           if (ch >= 'A' && ch <= 'Z') {
               int idx = ch - 'A'; // 0 - 25
               if (freq[idx] != 0)
                   p.add(new Pair(freq[idx], ch));
               freq[idx] = 0;
           } else if (ch >= 'a' && ch <= 'z') {
               int idx = ch - 'a' + 26; // 26 - 5
               if (freq[idx] != 0)
                   p.add(new Pair(freq[idx], ch));
               freq[idx] = 0;
           } else {
               int idx = ch - '0' + 52; // 52 - 61
               if (freq[idx] != 0)
                   p.add(new Pair(freq[idx], ch));
               freq[idx] = 0;
           }
       }
        Comparator<Pair> comp = new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.freq < o2.freq)return 1;
                return -1;
            }
        } ;
        Collections.sort(p, comp);
        String newS  = "";
        for(Pair i : p){
            System.out.println(i.ch + " " + i.freq);
            int n = i.freq;
            while(n > 0){
                 newS += i.ch;
                 n--;
            }
        }
        System.out.println(newS);
    }
}
