public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {2,3,9,3,1,2,4,2,5};
        int maxi = arr[0];  // 1. find max element

        for(int i = 1; i < arr.length; i++){
             if(maxi < arr[i]){
                 maxi = arr[i];
             }
//             maxi = Math.max(arr[i], maxi);
        }
        int freq[] = new int[(maxi+1)]; // 2. create freq array
        System.out.println(freq.length);
        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " "); // display
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;      // 3. fill the frequency array
        }
        
        for(int i = 0; i < freq.length; i++) System.out.print(freq[i] + " ");
        System.out.println();
        int idx = 0; // to track on old array;
        for(int i = 0; i < freq.length; i++){
            while(freq[i] > 0){
                arr[idx] = i;
                idx++;
                freq[i]--; 
            }
        }
        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
