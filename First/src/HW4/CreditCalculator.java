package HW4;

import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ask user for total credit amount
        System.out.print("Enter the total credit amount: ");
        double creditAmount = scan.nextDouble();
        // ask user for monthly interest rate
        System.out.print("Enter the monthly interest rate (in %): ");
        double monthlyInterestRate = scan.nextDouble() / 100;
        // ask user to choose one of two options
        System.out.println("Choose one of the following options:");
        System.out.println("1. Calculate the number of monthly payments");
        System.out.println("2. Calculate the amount of the monthly payment");
        int option = scan.nextInt();
        if (option == 1) {
            // calculate the number of monthly payments
            System.out.print("Enter the amount of the monthly payment: ");
            double monthlyPayment = scan.nextDouble();
            int numberOfPayments = 0;
            double remainingBalance = creditAmount;
            while (remainingBalance > 0) {
                remainingBalance += remainingBalance * monthlyInterestRate;
                remainingBalance -= monthlyPayment;
                numberOfPayments++;
            }
            System.out.println("Number of monthly payments: " + numberOfPayments);
        } else if (option == 2) {
            // calculate the amount of the monthly payment
            System.out.print("Enter the number of monthly payments: ");
            int numberOfPayments = scan.nextInt();
            double monthlyPayment = creditAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments)));
            System.out.println("Amount of the monthly payment: " + monthlyPayment);
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }
}

