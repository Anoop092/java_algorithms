public class FindMinimum {
    // find the minimum number in the array
    public static void main(String[] args) {
        int[] arr = {5,8,9,1,4,6};
        System.out.println(findMinimum(arr));
    }
    static int findMinimum(int[] arr){
        int min = arr[0];
        for (int i =0;i<arr.length; i++){
            if (arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
}
