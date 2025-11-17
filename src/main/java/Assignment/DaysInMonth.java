package Assignment;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number 1-12:");
        int months = sc.nextInt();
        int days = 0;
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        switch (months){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;

            case 4: case 6: case 9: case 11:
                days = 30;
                days = 30;

            case 2:
                if((year%400 == 0) || (year%4 ==0) || (year %100 !=0))
                    days = 29;
                else
                    days = 28;
                break;

            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println("The number of days : " +days);
    }
}
