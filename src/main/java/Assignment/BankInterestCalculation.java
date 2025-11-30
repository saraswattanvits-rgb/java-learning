package Assignment;

import java.util.Scanner;

public class BankInterestCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principle = sc.nextDouble();
        System.out.println("Enter the number of years: ");
        int years = sc.nextInt();
        TaxCalculator t1 = new TaxCalculator();
        double total = principle + t1.deduct_tax(t1.getInterest(principle, years));
        System.out.println("The total amount to be paid to customer is : Rs. " + total);
    }

    static class TaxCalculator {
        public double getInterest(double p, int y) {
            double total_interest = 0;
            if (p <= 50000) {
                total_interest = (p * 10 * y) / 100;
            } else if (p <= 100000) {
                total_interest = (p * 12 * y) / 100;
            } else {
                total_interest = (p * 15 * y) / 100;
            }
            return total_interest;
        }

        public double deduct_tax(double interest) {
            double tax = interest * 10 / 100;
            double interest_after_deduction = interest - tax;
            return interest_after_deduction;
        }
    }
}