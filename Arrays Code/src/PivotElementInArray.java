public class PivotElementInArray {
    static int findPivot(int arr[]){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = (s + e )/ 2;
            if(mid - 1 >= 0 && arr[mid] < arr[mid-1])return mid;
            if(arr[0] <= arr[mid])s = mid + 1;
            else e = mid - 1;
        }
        if(s == arr.length)return 0;
        else if(e < 0)return arr.length-1; 
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,0,1,2,3};
        System.out.println(findPivot(arr));
    }
}
