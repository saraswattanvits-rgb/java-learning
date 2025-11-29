package Assignment;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit of your choice.");
        int digit =  sc.nextInt();
        int sum = 0;
        int temp = digit;
        while(temp>0){
            int last = temp%10;
            sum+= last;
            temp /=10;

        }
        System.out.println("The sum is: " +sum);
    }
}
