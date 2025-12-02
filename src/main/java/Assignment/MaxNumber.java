package Assignment;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {10,20,5,17,45,12};

        int max = arr[0];

        for(int i = 1; i<arr.length ; i++){
            if(arr[i]>max){
                max= arr[i];
            }

        }
        System.out.println(max);
    }
}
