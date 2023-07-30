package Accountbalance;

public class Account {
    public double balance;

    public Account(){
        this.balance=0.0;
    }

    public Account(double initialBalance,double additionalAmount){
        this.balance=initialBalance+additionalAmount;
    }


    public void withdraw(double withdrawAmount){
        if(withdrawAmount>balance){
            System.out.println("Cannot withdraw as balance is less");
            return;

        }
        else{
            System.out.println("Please take your cash of:"+ withdrawAmount);
            this.balance=this.balance-withdrawAmount;

        }
    }

    public void deposit(double depositAmount){
        if (depositAmount>0){
            this.balance=this.balance+depositAmount;
        }
    }

    public double checkBalance(){
        System.out.println("current balance is :"+this.balance);
        return this.balance;
    }

}
