package tp3;

public class BankAccount {
    private int accountNum;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public BankAccount(int num, double amount) {
        accountNum = num;
        this.balance = amount;

    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " deposited");
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("sorry , we can't do this operation");
        } else {
            this.balance -= amount;
            System.out.println(amount + " withdrawn");
        }

    }

    public void displayBalance() {
        System.out.println("account number : " + accountNum + "  balance : " + balance);

    }

}