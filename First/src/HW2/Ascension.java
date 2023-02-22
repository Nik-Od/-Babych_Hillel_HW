package HW2;

import java.util.Scanner;

public class Ascension {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int num1 = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.print("Input a number 2: ");
        int num2 = second.nextInt();
        System.out.println("Exponentiation of 1st number to 2nd = " + Math.pow(num1, num2));
    }
}
