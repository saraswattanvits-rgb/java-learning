package Assignment;

import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner s1 =  new Scanner(System.in);
        System.out.println("Please enter a number:");
        double x = s1.nextDouble();
        double sq = x*x ;
        double cube = x*x*x ;
        double fourth = x*x*x*x;

        System.out.println("The square of " +x +" is: " +sq);
        System.out.println("The cube of " +x+" is: "+cube);
        System.out.println("The power to fourth of "+x +" is: " +fourth);

    }
}
