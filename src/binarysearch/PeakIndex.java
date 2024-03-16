package binarysearch;

public class PeakIndex {
    // Find the peak element index of given array
    // {5,6,7,8,9,4,3,2,1}
    public static void main(String[] args) {
        int[] nums = {3,5,3,2,0};
        System.out.println(findPeak(nums));
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end =arr.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid>0 &&(arr[mid]>arr[mid-1]) && (arr[mid]>arr[mid+1])){
                return arr[mid];
            } else if (mid<arr.length &&arr[mid]<arr[mid+1]) {
                start = mid+1;
            } else if (mid<arr.length && arr[mid]>arr[mid+1]) {
                end = mid-1;
            }
        }
        return -1;
    }
}
