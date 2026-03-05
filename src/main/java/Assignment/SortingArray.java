package Assignment;

import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements for the array: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //sort
        for(int i= 0; i < size; i++){
            for(int j = i +1; j < size; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Your sorted array is: ");
        for (int i=0; i < size; i++){
            System.out.println(arr[i] + " ");
        }
    }
}

