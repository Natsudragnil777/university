package tp3;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the acount number :");
        int accountNum = inp.nextInt();
        System.out.println("enter the balance : ");
        double balance = inp.nextDouble();

        BankAccount account1 = new BankAccount(accountNum, balance);

        System.out.println("enter the deposit value :");
        double deposit = inp.nextDouble();
        account1.deposit(deposit);
        System.out.println("enter the withdraw value : ");
        double withdraw = inp.nextDouble();
        account1.withdraw(withdraw);

        System.out.println("the final balance : " + account1.getBalance());

    }
}
