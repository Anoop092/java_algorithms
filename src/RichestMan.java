import java.util.ArrayList;

public class RichestMan {
    public static void main(String[] args) {
        int[][] arr = {{1,5},{3,7},{3,5}};
        int[] sumOfRowsArray = findRichestMan(arr);
        System.out.println("The richest persons in given array is: " + richestManIndex(sumOfRowsArray));

    }
    static int[] findRichestMan(int[][] arr){
        int[] result  = new int[arr.length];
        for(int row=0;row<arr.length;row++){
            int sumOfRow = 0;
            for(int col=0;col<arr[row].length; col++){
                sumOfRow += arr[row][col];
            }
            result[row] = sumOfRow;
        }
        return result;
    }
    static  int richestManIndex(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }
}
