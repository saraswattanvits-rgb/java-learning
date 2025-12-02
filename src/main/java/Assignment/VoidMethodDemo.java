package Assignment;

public class VoidMethodDemo {
    public static void main(String[] args) {
        Demo3.isTrue();
        Demo3 d = new Demo3();
        d.isFalse();

    }
}
    class Demo3{
        public static void isTrue(){
            System.out.println("True");
        }

        public void isFalse(){
            System.out.println("False");
        }
    }

