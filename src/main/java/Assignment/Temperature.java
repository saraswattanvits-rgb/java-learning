package Assignment;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius: ");
        double celsius = scan.nextDouble();
        double fahrenheit = (celsius*1.8)+32 ;
        double kelvin = celsius + 273.15 ;
        System.out.println("The temperature in Fahrenheit is: "+ fahrenheit +" degrees");
        System.out.println("The temperature in Kelvin is: " +kelvin + "degrees");


    }
}
