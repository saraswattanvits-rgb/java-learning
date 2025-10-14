package Assignment;


import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes:");
        long total_minutes = sc.nextLong();
        long minutesInYear = 365 * 60 * 24 ;
        long minutesInDay = 60 * 24 ;
        long years = total_minutes/minutesInYear;
        long days = total_minutes/minutesInDay;
        System.out.println(years +" Years");
        System.out.println((days + " days"));


    }
}
