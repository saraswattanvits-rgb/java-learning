package Assignment;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        c.sum(3,4);
        c.sum(234566, 345644);

    }
}

    class Calculator1{
        public  int sum(int a, int b){
            return a + b;
        }

        public float sum(float a, float b){
            return a + b;
        }

        public double sum(double a, double b){
            return a + b;
        }

        public long sum(long a, long b){
            return a + b ;
        }
    }

