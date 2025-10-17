package Assignment;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        float num = sc.nextFloat();
        if(num>=0){
            System.out.println("This number is positive.");
        }else{
            System.out.println("This number is negative.");
        }
    }
}
