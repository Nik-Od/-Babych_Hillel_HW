package HW2;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner first = new Scanner(System.in);
        System.out.print("Amount of working hours: ");
        int num1 = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.print("Income per hour: ");
        int num2 = second.nextInt();
        Scanner third = new Scanner(System.in);
        System.out.print("Tax: ");
        int num3 = third.nextInt();
        int notaxmonth = num1 * num2 * 4;
        System.out.println("Salary per month without tax= " + notaxmonth);
        int taxmonth = notaxmonth - (notaxmonth / 100 * num3);
        System.out.println("Salary per month with taxes= " + taxmonth);
        int notaxyear = notaxmonth * 12;
        System.out.println("Salary per year without taxes= " + notaxyear);
        int taxyear = notaxyear - (notaxyear / 100 * num3);
        System.out.println("Salary per year with taxes= " + taxyear);
    }

}
