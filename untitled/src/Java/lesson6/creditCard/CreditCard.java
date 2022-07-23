package Java.lesson6.creditCard;

public class CreditCard {

    public String accountNumber;
    public double currentAmount;

    public CreditCard(String accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public void refill(double value) {
        currentAmount += value;
    }

    public void debiting(double value) {
        currentAmount -= value;
    }

    public void printBalance() {
        System.out.println("Карта " + accountNumber + " " + "Текущий остаток " + currentAmount);
    }
}