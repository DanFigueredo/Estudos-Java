package JavaExercises.Domain;

public class BankAccount {
    private String holder;
    private double balance;

    public BankAccount(){

    }
    public BankAccount(String holder){
        this.holder = holder;
    }
    public BankAccount(String holder, double balance){
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double value) {
        if (value <= 0 ){
            System.out.println("Invalid Value");
        }
        balance += value;

    }
    public void withdraw(double value){
        if (value > balance){
            System.out.println("You can't withdraw this value");

        }
        balance = balance - value;

    }

    public void showData(){
        System.out.println("Account Holder: " + holder);
        System.out.println("Account Balance: "+ balance);
    }



    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


