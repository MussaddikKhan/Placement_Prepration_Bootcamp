import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DivisibleSumPairs {
    static  int solve(int n, int k , List<Integer> arr){
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int b = arr.get(i)%k;
            if(i > 0){
                int a = b == 0 ? 0 :  k - b;
                if(mp.containsKey(a) == true){
                    ans += mp.get(a);
                }
            }
            mp.put(b, mp.getOrDefault(b, 0) + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1, 3, 2, 6, 1, 2));
        int n  = 6, k = 3;
        System.out.println(solve(n, k, arr));
    }
}
