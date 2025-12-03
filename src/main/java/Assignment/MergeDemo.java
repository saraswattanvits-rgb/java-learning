package Assignment;

import java.util.Locale;
import java.util.Scanner;

public class MergeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        String result =mergeTwo(s1, s2);
        System.out.println(result);
    }

    public static String mergeTwo(String a, String b){
            a = a.toLowerCase();
            b = b.toLowerCase();

            String output;

            if(a.charAt(a.length()-1) == b.charAt(0)){
                output = a + b.substring(1);
            }
            else {
                output = a + b;
            }
                return output;


    }
}
