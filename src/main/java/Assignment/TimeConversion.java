package Assignment;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in seconds:");
        int sec = sc.nextInt();
        int hours = sec/3600;
        int minutes = (sec%3600)/60;
        int seconds = sec%60;

        System.out.println(hours +" Hours, " +minutes + " Minutes, "+seconds +" Seconds");
    }
}
