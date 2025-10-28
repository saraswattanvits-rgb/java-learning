package Assignment;


import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int reverse = 0;

        while (number!=0){
            int last_digit = number%10;
            reverse =  reverse *10 + last_digit;
            number = number / 10 ;
        }
        System.out.println(reverse);
    }
}
