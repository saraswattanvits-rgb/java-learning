package Assignment;

public class NonParameterizedMethod {
    public static void main(String[] args) {
        Demo1.display();
        Demo1 d1 = new Demo1();
        d1.show();
    }

}
   class Demo1 {
        public static void display() {
            System.out.println("This will not return anything.");
        }

        public void show() {
            System.out.println("No return type");
        }
    }
