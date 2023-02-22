package HW3;
import java.util.Scanner;

public class Number_Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 1) {
            System.out.println("Number is odd");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Number is even");
        }
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Number is negative");
        }
        int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && num != 0) {
            System.out.println("The number is prime.");
        } else{
            System.out.println("The number is composite.");
        }

    }
}



