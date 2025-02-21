public class FindVowel {
   
    public static void main(String[] args) {
        String vowel = "aeiouAEIOU";
        String s = "LeetCode";
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(vowel.indexOf(ch) != -1){
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }
}
