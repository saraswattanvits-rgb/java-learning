package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Rainfall {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rainfall for last 7 days: ");
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        double average = 0;

        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
            average = sum / arr.length;

        Arrays.sort(arr);

        System.out.println("Average rainfall in cm : " +average);
        System.out.println("Maximum rainfall in cm : " +max);
        System.out.println("Minimum rainfall in cm : " +min);
        System.out.println("Ascending order: " +Arrays.toString(arr));
        }

    }
