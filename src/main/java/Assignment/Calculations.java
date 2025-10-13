package Assignment;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double x = s1.nextDouble();
        System.out.println("Enter second number:");
        double y = s1.nextDouble();
        double sum = x + y;
        double difference = x-y;
        double product = x*y;
        double average = (x+y)/2;
        double max = Math.max(x,y);
        double min = Math.min(x,y);

        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        System.out.println("Product = " +product);
        System.out.println("Average =" +average);
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}
