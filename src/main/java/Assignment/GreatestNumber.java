package Assignment;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = s1.nextInt();
        System.out.println("Enter the second number:");
        int num2 = s1.nextInt();
        System.out.println("Enter the third number:");
        int num3 = s1.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("The greatest number is " +num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The greatest number is " +num2);
        }
        else{
            System.out.println("The greatest number is " +num3);
        }
    }
}
