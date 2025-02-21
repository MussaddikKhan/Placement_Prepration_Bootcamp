public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        int freq[] = new int[52];   // 52 
        String s = "Leetcodel";
        for (int i = 0; i < s.length(); i++) { // O(n)
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {     // O(1)
                freq[ch - 'a']++;
            } else {
                freq[ch - 'A' + 26]++;
            }
        }
   
        char ans = ' ';
        for (int i = 0; i < s.length(); i++) {  //O(n)
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {   //O(1)
                if (freq[ch - 'a'] == 1) {
                    ans = ch;
                    break;
                }
            } else {
                if (freq[ch - 'A' + 26] == 1) {
                    ans = ch;
                    break;
                }
            }
        }
        System.out.println(ans + " ");
    }
}
