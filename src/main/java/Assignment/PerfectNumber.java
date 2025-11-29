package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();
        if(isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        }
        else{
            System.out.println(number+ " is not a perfect number.");
        }}
        catch (InputMismatchException e){
            System.out.println("Invalid input! Please enter a valid number.");
        }


    }

    static  boolean isPerfectNumber(double num){
        double sum = 0;
        for(int i =1; i<num; i++){
            if(num%i==0){
                sum =  sum + i;
            }
        }
        if(sum== num)
            return true;

        else
            return false;
    }

}




