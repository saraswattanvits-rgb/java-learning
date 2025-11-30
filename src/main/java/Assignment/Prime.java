package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if(isPrimeNumber(num) == true){
                System.out.println(num + " is a prime number.");
            }
            else{
                System.out.println(num + " is not a prime number.");
            }


        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid number.");
        }
    }
    public static boolean isPrimeNumber(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
