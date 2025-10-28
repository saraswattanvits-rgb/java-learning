package Assignment;

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        System.out.println("First 20 prime numbers are:");

        while (count < 20) {
            if (isPrimeNumber(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

        public static boolean isPrimeNumber(int n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }}


