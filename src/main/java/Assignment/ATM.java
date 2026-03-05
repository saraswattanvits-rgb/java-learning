package Assignment;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("Welcome to the ATM!");
        System.out.println("====================================================");
        System.out.println("Please insert your debit card to continue");
        System.out.println("Select an option : ");
        System.out.println("1. Withdrawal");
        System.out.println("2. Account Balance");
        System.out.println("3. Cancel");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();


        //withdrawal
        if(option == 1 ){
            System.out.println("Please enter your pin: ");
            int pin = sc.nextInt();
            if(pin<999 || pin > 9999){
                System.out.println("Incorrect pin. Kindly try again ");
            }
            else{
                System.out.println("Please enter the amount you wish to withdraw.");
                double amount = sc.nextDouble();
                if(amount >= 10000 || amount%1000 != 0){
                    System.out.println("Invalid amount. You can withdraw less than Rs.10000. The amount should be in denomination of 1000.");
                }else {
                    System.out.println("You have withdrawn Rs. " +amount);
                }
            }

            //account balance
        } else if (option == 2) {
            System.out.println("Please enter your pin: ");
            int pin = sc.nextInt();
            if(pin<999 || pin > 9999){
                System.out.println("Incorrect pin. Kindly try again ");
            }
            else {
                double min = 10000.00;
                double max = 99999.99;
                double amount = min + (Math.random() * (max - min));
                amount = Math.round(amount * 100.0) /100.0;
                System.out.println("Your current balance is Rs.: " +amount);
            }

        }
//cancel
        else if(option == 3){
            System.out.println("Thank you for using the ATM. Good day!");
            System.out.println("Please insert your debit card to proceed.");
        }

        else {
            System.out.println("Invalid input. Please try again.");
        }

    }
}
