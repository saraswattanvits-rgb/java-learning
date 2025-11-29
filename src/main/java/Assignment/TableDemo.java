package Assignment;

public class TableDemo {
    public static void main(String[] args) {
        for(int i= 1; i<=20;i++){
            if(i==6 || i==17 || i==12){
                continue;
            }
            System.out.println("Table for " +i + " is : ");
            for(int j =1; j<=10; j++){
                System.out.println(i + " x " +j + " = "+ (i*j));
            }
            System.out.println();
        }
    }
}
