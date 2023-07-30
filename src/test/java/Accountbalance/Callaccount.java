package Accountbalance;

public class Callaccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.checkBalance();
        account.deposit(34);
        account.checkBalance();
        account.withdraw(22);
        account.checkBalance();
        account.withdraw(13);
        account.checkBalance();
    }
}
