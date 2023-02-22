package HW4;

import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = Double.parseDouble(args[0]);
        double taxPercentage = Double.parseDouble(args[1]) / 100 ;
        System.out.println("Hour rate - " + hourlyRate + " and tax - " + args[1] + "%");
        int daysInMonth = 31;
        int workingHoursPerDay = 8;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        String[] months = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };
        int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        double totalSalaryWithoutTaxes = 0;
        double totalSalaryWithTaxes = 0;

        for (int i = 0; i < months.length; i++) {
            int workingDaysInMonth = getWorkingDaysInMonth(daysInMonths[i]);
            double salaryWithoutTaxes = workingDaysInMonth * workingHoursPerDay * hourlyRate;
            double salaryWithTaxes = salaryWithoutTaxes * (1 - taxPercentage);
            totalSalaryWithoutTaxes += salaryWithoutTaxes;
            totalSalaryWithTaxes += salaryWithTaxes;

            System.out.println(months[i] + " - $" + decimalFormat.format(salaryWithoutTaxes) + " - $"
                    + decimalFormat.format(salaryWithTaxes));
        }

        System.out.println("TOTAL: $" + decimalFormat.format(totalSalaryWithoutTaxes) + " - $"
                + decimalFormat.format(totalSalaryWithTaxes));
    }

    private static int getWorkingDaysInMonth(int daysInMonth) { // The getWorkingDaysInMonth method calculates the number of working days in a month by checking if the current day is a weekend or not.
        int workingDays = 0;
        for (int i = 1; i <= daysInMonth; i++) {
            if (i % 7 != 6 && i % 7 != 0) {
                workingDays++;
            }
        }
        return workingDays;
    }

}
