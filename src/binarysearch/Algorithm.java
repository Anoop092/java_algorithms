package binarysearch;
public class Algorithm {
    // Binary search algorithm
    // It is applicable only for sorted array
    public static void main(String[] args) {
        /* procedure
          1) initialize first and last position of array
          2) find the mid element array
          3) if mid element is equal to target element return index of element in array
          4) else if target element > mid element check right side, else check left side
          5) continue step 3 and 4 until start>end
          6) if target element not found in array return -1
         */
        int[] arr = {1,2,3,4,5,6,72,86,89};
        int target = 86;
        System.out.println(search(arr,target));
    }
    static  int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
