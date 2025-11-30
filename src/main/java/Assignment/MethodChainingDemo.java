package Assignment;

import java.lang.invoke.MethodHandle;

public class MethodChainingDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
     c1.initialize(5).add(10).multiply(2).result(c1.i);
    }

    static class Calculator {
        int i = 0;

        public Calculator initialize(int x) {
            this.i = x;
            return this;
        }

        public Calculator add(int y) {
            this.i = i + y;
            return this;
        }

        public Calculator multiply(int z) {
            this.i = i * z;
            return this;
        }

        public Calculator result(int x){
            System.out.println("Result: " +x);
            return this;
        }

    }
}