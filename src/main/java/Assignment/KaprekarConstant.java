package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class KaprekarConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-digit number: ");
        int num = sc.nextInt();
        int count=0;
    while (num!= 6174){
        int asc = ascendingOrder(num);
        int desc = getDescendingOrder(num);

        num = desc - asc ;
        count++;
            System.out.println(desc+ " = " +asc +" = " +num);
        }
        System.out.println("Kaprekar's constant reached in " +count +" steps.");
    }


    public static int ascendingOrder(int num) {
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



