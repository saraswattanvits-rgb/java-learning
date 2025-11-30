package Assignment;

import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first digit: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second digit: ");
        int num2 = sc.nextInt();

        System.out.println("Sum of the digits is: " +Demo2.add(num1, num2));

        Demo2 d2 = new Demo2();
        System.out.println("Difference between the digits is: " + d2.subtract(num1, num2));
    }
}

class Demo2{
    public static int add(int a, int b){
        int result = a + b;
        return result;

    }

    public int subtract(int a, int b){
        int result = Math.abs(a - b);
        return result;
    }
}