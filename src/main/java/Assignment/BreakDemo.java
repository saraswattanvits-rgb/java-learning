package Assignment;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit : ");
        int x = sc.nextInt();
        while(true){
            if(x<0) {
                break;
            }
            else{
                    System.out.println("Infinite loop.");
                }
            }
        }
    }

