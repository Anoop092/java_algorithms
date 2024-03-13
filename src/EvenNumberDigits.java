public class EvenNumberDigits {
    // algorithms to find even  number of digits in given array
    public static void main(String[] args) {
        int[] arr = {-12,345,2,6,7896,6897,333333};
        System.out.println(findEvenDigits(arr));
    }
    static int findEvenDigits(int[] arr){
        int counter = 0;
        for(int num: arr){
            int noOfDigits = countDigits(num);

            if (noOfDigits%2 ==0){
                counter++;
            }
        }
        return counter;
    }
    static int countDigits(int n){
        if (n<0){
            n *=-1;
        }
        if (n==0){
            return 1;
        }
        int count=0;
        while(n>0){
           n=n/10;
           count++;
        }
        return count;
    }
}
