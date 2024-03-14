package binarysearch;

public class OrderAgnosticBinarySearch {
    // when we don't know given array is in ascending order or descending order
    public static void main(String[] args) {
//        int[] arr = {9,8,6,5,4,3,2,1};
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsce =  arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target){
                return mid;
            } else{
                if(isAsce){
                    if (arr[mid]>target){
                        end = mid-1;
                    }else {
                        start = mid+1;
                    }
                }else{
                    if(arr[mid]>target){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }
            }
        }
        return  -1;
    }
}
