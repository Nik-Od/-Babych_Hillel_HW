package HW5;
public class Credit {
    private String name;
    private double amount;
    private double interestRate;
    private int term;

    public Credit(String name, double amount, double interestRate, int term) {
        this.name = name;
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTerm() {
        return term;
    }

    public double getMonthlyPayment() {
        double monthlyRate = interestRate / 1200;
        double payment = (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -term));
        return payment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * term;
        return totalPayment;
    }
}

