package binarysearch;

public class SmallestLetter {
    // Find the smallest letter greater than target element
    public static void main(String[] args) {
        char [] arr ={'a','b','c','d','e'};
        char target = 'e';
        System.out.println(search(arr,target));
    }
    static char search(char[] arr,char ch){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==ch){
                if(mid+1< arr.length) {
                    return arr[mid + 1];
                }
                return arr[0];
            } else if (ch > arr[mid]) {
                 start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return arr[start];
    }
}
