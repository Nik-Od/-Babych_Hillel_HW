package HW2;
import java.util.Scanner;
public class HourPrice {
    public static void main (String[] args) {

        Scanner first = new Scanner(System.in);
        System.out.print("Amount of working hours per week: ");
        int A = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.print("Year income after taxes: ");
        int B = second.nextInt();
        Scanner third = new Scanner(System.in);
        System.out.print("Tax: ");
        int C = third.nextInt();
        int YearSalaryWithoutTaxes = (B / (100 - C)) * 100;
        int HourSalaryWithoutTaxes = YearSalaryWithoutTaxes / 48 / A;
        System.out.println("At " + A + " working hours per week with an annual salary of " + YearSalaryWithoutTaxes +
                " and tax of " + C +"%" + " an hour of time costs " + HourSalaryWithoutTaxes + "$." );
    }

}
