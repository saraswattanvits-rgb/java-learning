package Assignment;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] arr = {10,20,5,17,45,12};
        int min1 = arr[0];
        int min2 = arr[0];
        int max1 = arr[0];
        int max2 = arr[0];


        for(int num: arr){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }
            else if (num > max2){
                max2 = num;
            }

            if (num < min1){
                min2 = min1;
                min1 = num ;
            } else if (num<min2) {
                min2 = num;
            }
        }
        System.out.println("Maximum number 1: " +max1);
        System.out.println("Maximum number 2: " +max2);
        System.out.println("Minimum number 1: " +min1);
        System.out.println("Minimum number 2: " +min2);
    }
}
