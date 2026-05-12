package javacore.introductionmethods.domain;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0){
            System.out.println("INVALID BALANCE!!!!!!");
            return;
        }else{
            this.balance = balance;
        }

    }

    public void showData(){
        System.out.println("------->Account<------- ");
        System.out.println("Holder name: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
    }
}


