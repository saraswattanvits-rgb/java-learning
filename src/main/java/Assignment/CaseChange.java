package Assignment;

import java.util.Scanner;

public class CaseChange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence in lowercase: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {

                String upperCase = word.substring(0, 1).toUpperCase() + word.substring(1);
                result.append(upperCase).append(" ");
            }
        }

        System.out.println("Converted String: " + result.toString());
    }
}
