package Assignment;

public class InfiniteLoop {
    public static void main(String[] args) {
       while(true){
            System.out.println("This is while loop.");
        }

        for( ; ; ){
            System.out.println("This is for loop");
        }

        do {
            System.out.println("This is do-while inifinite loop");
        }
        while (true);
    }
}
