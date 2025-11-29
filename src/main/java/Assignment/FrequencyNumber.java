package Assignment;

import java.util.Scanner;

public class FrequencyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Enter the digit to count:");
        int digit = sc.nextInt();
        int frequency = countDigit(number, digit);
        System.out.println("The frequency of the number is: "+ frequency);


        }

    static int countDigit(int n, int m){
            int count = 0;

            while(n>0){
                int last_digit = n%10;
                if(last_digit == m){
                    count++;
                }
                n /= 10;
            }
            return count;
    }
}

