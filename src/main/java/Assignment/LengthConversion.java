package Assignment;

import java.util.Scanner;

public class LengthConversion {
    public static void main(String[] args) {
        Scanner s1 =  new Scanner(System.in);
        System.out.println("Enter the length in inches:");
        double input = 0.0;
        String inches =  s1.nextLine().trim();
        while(true) {
            try {
                input = Double.parseDouble(inches);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                break;
            }
        }
        double meters = input * 0.0254;
        double rounded = Math.round(meters * 100.0) / 100.0;
        System.out.println(rounded);
        }
    }

