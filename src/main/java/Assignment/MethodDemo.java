package Assignment;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first digit: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second digit: ");
        int num2 = sc.nextInt();
        MethodDemo m1 = new MethodDemo();
        System.out.println("The sum of these numbers is: " +add(num1, num2));
        System.out.println("The difference between these numbers is: " +m1.subtract(num1,num2));


    }

    public static int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

}





