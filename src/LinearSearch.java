import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = input();
        int target = 25;
        System.out.println(search(arr,target));
    }
    static int[] input(){
        /*
         This function help us to store elements which entered by user
         in array and returns that array.
         */
        System.out.println("Enter the Size of array");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of Array");
        for(int i=0; i< arr.length;i++){
            arr[i] = in.nextInt();
        }
        return arr;
    }
    static int search(int[] arr,int target){
        /*
        This function takes array and target element as input, if target element is
        found it returns index of target element else it returns -1 if index of target
         element not found in array
        */
        for (int i=0;i<arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
