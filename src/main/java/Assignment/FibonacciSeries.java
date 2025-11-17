package Assignment;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of series:");
        int length = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i =1 ; i <= length; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
