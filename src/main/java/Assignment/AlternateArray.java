package Assignment;

public class AlternateArray {
    public static void main(String[] args) {
        int[] ar = {10,20,30,40,50};
        for(int i = 0; i<ar.length; i += 2){
            System.out.println(ar[i]);
        }
    }
}
