package Assignment;

import java.util.Scanner;

public class MoneyReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the final bill amount: ");
        double bill = sc.nextDouble();
        System.out.println("Enter the money given by customer: ");
        double money = sc.nextDouble();
        double change = money - bill;

        System.out.println("The amount to be returned is: " +change);

        int[] bills = {100,50,20,10,5,2,1};
        int remaining = (int) change;

        for(int i : bills){
            int count = remaining/i;
            if(count>0){
                System.out.println("Rs. " +i + " x " +count);
                remaining %= i;
            }
        }





    }
}
