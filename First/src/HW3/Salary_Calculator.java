package HW3;

public class Salary_Calculator {
    public static void main (String[] args) {

        int month = Integer.parseInt(args[0]);
        System.out.println("Month " + month);
        int hourIncome = Integer.parseInt(args[1]);
        System.out.println("Salary per hour " + hourIncome + "$");
        int tax = Integer.parseInt(args[2]);
        System.out.println("Tax " + tax + "%");
        switch (month) {
            case 1:
                month = 20;
                break;
            case 2:
                month = 20;
                break;
            case 3:
                month = 22;
                break;
            case 4:
                month = 19;
                break;
            case 5:
                month = 21;
                break;
            case 6:
                month = 20;
                break;
            case 7:
                month = 21;
                break;
            case 8:
                month = 21;
                break;
            case 9:
                month = 21;
                break;
            case 10:
                month = 21;
                break;
            case 11:
                month = 22;
                break;
            case 12:
                month = 20;
                break;
        }
        System.out.println("Salary before taxes " + month * 8 * hourIncome);
        float taxCalc = (100 - 25) / 100f;
        System.out.println("Salary after taxes " + month * 8 * hourIncome * taxCalc);
    }
}
