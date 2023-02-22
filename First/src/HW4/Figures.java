package HW4;

import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";

        while (answer.equals("yes")) {
            System.out.println("Which figure do you want to draw?");
            System.out.println("1. Rectangle");
            System.out.println("2. Rectangular Triangle");
            System.out.println("3. Inverted Rectangular Triangle");
            System.out.println("4. Triangle");
            int figure = input.nextInt();

            switch (figure) {
                case 1:
                    System.out.print("Enter the height: ");
                    int height = input.nextInt();
                    System.out.print("Enter the width: ");
                    int width = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter the height: ");
                    height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter the height: ");
                    height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height - i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Enter the height: ");
                    height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height - i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= 2 * i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            System.out.println("Do you want to draw another figure? (yes/no)");
            answer = input.next();
        }
    }
}
