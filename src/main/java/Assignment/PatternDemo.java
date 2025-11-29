package Assignment;

import java.util.Scanner;

public class PatternDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern.");
        int rows = sc.nextInt();
        int num = 1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
            num = num+2;
        }
    }
}
