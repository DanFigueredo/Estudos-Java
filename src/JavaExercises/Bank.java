package JavaExercises;

import JavaExercises.Domain.User;

public class Bank {
    private String accountHolder;
    private double balance;
    private static String bankName;
    static{
        bankName = "Santander";
    }
    private static int totalAccounts;

    public Bank(String accountHolder){
        totalAccounts ++;
        this.accountHolder = accountHolder;
    }

    public void deposit(double value){
        if (value <= 0 ){
            System.out.println("You can't deposit this value!");
            return;
        }
        balance += value;

    }

    public void withDraw(double value){
        if (value > balance){
            System.out.println("You can't withdraw this value!");
            return;
        }
        balance -= value;

    }

    public void showData(){
        System.out.println("Bank name: " + bankName);
        System.out.println("AccountHolder: " + accountHolder);
        System.out.println("Balance: " + balance);

    }

    public static void showTotalAccounts(){
        System.out.println("Total Accounts: " + totalAccounts);
    }


    public static void main(String[] args) {
       Bank user1 = new Bank("Daniel");

       user1.deposit(1000);
       user1.withDraw(200);
       user1.showData();

        Bank user2 = new Bank("Rogerio");
        user2.deposit(800);
        user2.withDraw(500);
        user2.showData();

        Bank user3 = new Bank("Miguel");
        user3.deposit(10);
        user3.withDraw(200);
        user3.showData();

        Bank.showTotalAccounts();
    }
}
