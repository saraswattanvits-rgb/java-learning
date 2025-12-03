package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        int num = sc.nextInt();
        int smallest = getascendingOrder(num);
        int largest = getDescendingOrder(num);

        System.out.println("Smallest number is: " +smallest);
        System.out.println("Largest number is: " +largest);

    }

    public static int getascendingOrder(int num) {
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);

        int asc = 0;
        for (int a : digits) {
            asc = asc * 10 + a;
        }
        return asc;
    }
    public static int getDescendingOrder(int num){
        int digits[] = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);

        int desc = 0;
        for (int i = 3; i >= 0; i--) {
            desc = desc * 10 + digits[i];
        }
        return desc;
    }
}

