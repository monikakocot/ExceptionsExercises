package pl.akademiakodu.calculator.bankAccount;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public BankAccount() {
        this.amount = 0;
    }

    public void deposit(double amount) {
        this.amount += amount;
    }

    public void withdraw(double money) throws InsufficientFundsException {
        if (amount < money)
            throw new InsufficientFundsException();
        else
            this.amount -= money;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        try {
            bankAccount.withdraw(100);
            System.out.println(bankAccount.getAmount());
            bankAccount.withdraw(500);
            System.out.println(bankAccount.getAmount());
            bankAccount.withdraw(900);
        } catch (InsufficientFundsException e) {
            System.out.println("There are insufficient funds on the account for withdrawal");
            System.out.println(bankAccount.getAmount());
        }
    }


}