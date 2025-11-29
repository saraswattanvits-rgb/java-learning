package Assignment;

import java.util.ArrayList;

public class NumberFounder {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(int i=1; i<=100; i++){
            if(i%3==0){
                arr1.add(i);
            } else if(i%5==0) {
                arr2.add(i);
            }
            if(i%3==0 && i%5==0){
                arr3.add(i);

            }
        }
        System.out.println("The numbers divided by 3 are: " +arr1);
        System.out.println("The numbers divided by 5 are: " +arr2);
        System.out.println("The numbers divided by 3 and 5 are: " +arr3);
    }
}
