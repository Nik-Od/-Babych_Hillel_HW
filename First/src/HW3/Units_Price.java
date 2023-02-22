package HW3;
import java.util.Scanner;

public class Units_Price {
    public static void main(String[] args) {
        int pricePerUnit = Integer.parseInt(args [0]);
        System.out.println("Price per unit: " + pricePerUnit);

        Scanner first = new Scanner (System.in);
        System.out.print("Amount of units: ");
        int amount = first.nextInt();
        if (amount <= 10) {
            System.out.println (amount * pricePerUnit);
        }
        if (amount > 80) {
            System.out.println (amount * pricePerUnit * 0.87);
        }else if( amount > 70) {
            System.out.println (amount * pricePerUnit * 0.864);
        }else if( amount > 60) {
            System.out.println(amount * pricePerUnit * 0.868);
        } else if ( amount > 50) {
            System.out.println(amount * pricePerUnit * 0.872);
        } else if( amount > 40) {
            System.out.println (amount * pricePerUnit * 0.876);
        } else if( amount > 30) {
            System.out.println (amount * pricePerUnit * 0.88);
        } else if( amount > 20) {
            System.out.println(amount * pricePerUnit * 0.9) ;
        } else if ( amount > 10) {
            System.out.println (amount * pricePerUnit * 0.95);
        }


    }
}
