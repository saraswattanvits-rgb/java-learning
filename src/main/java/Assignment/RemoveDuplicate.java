package Assignment;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of your choice: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);

            if(sb.indexOf(String.valueOf(c))==-1){
                sb.append(c);
            }
        }
        System.out.println("String after removing duplicate characters: " +sb);

    }
}
