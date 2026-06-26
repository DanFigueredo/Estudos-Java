package JavaExercises.Domain;

import java.util.Scanner;

public class ConsultorAccount {

    //Variables
    private  double initialBalance;
    private double overDraft;
    private double balance;
    private String useOverdraft;
    private boolean overDraftResult;
    Scanner scanner = new Scanner(System.in);

    //Methods/Functions:
    public void amount(){
        balance = balance + initialBalance;
    }

    //Check account amount
    public void checkBlance(){
        System.out.println("Your balance is: " + balance);
    }

    //Check overDraft
    public void checkOverDraft(){

        if (initialBalance <= 500){
            overDraft = 50;
        }

        if (initialBalance > 500){

            overDraft = initialBalance * 0.5;
        }

        System.out.println("Your overdraft protection is: " + overDraft);

    }

    //Deposit Balance
    public void depositBalance(double value){
        if (value < 0){
            System.out.println("You can't deposit this value");
            return;
        }
        balance += value;
    }

    //Withdraw balance
    public void withDrawBalance(double value){
        if (value > balance + overDraft || balance <= 0){
            System.out.println("You can't withdraw this value ");
            return;
        }
        if (value <= balance + overDraft){
            System.out.print("Do you want to use your overdraft (Y/N): ");
            useOverdraft = scanner.nextLine();
            if (useOverdraft.equals("Y")|| useOverdraft.equals("y")){
                overDraftResult = true;
            }else if (useOverdraft.equals("N")|| useOverdraft.equals("N")){
                overDraftResult = false;
                return;
            }else{
                System.out.println("Invalid option");
                return;
            }
        }

        balance -= value;
    }

    public void payTicket(double value){
        if (value > balance + overDraft){
            System.out.println("Your balance is insufficient!");
            return;
        }
        if (value <= balance + overDraft){
            System.out.print("Do you want to use your overdraft (Y/N): ");
            useOverdraft = scanner.nextLine();
        }if (useOverdraft.equals("Y")|| useOverdraft.equals("y")){
            overDraftResult = true;
        }else if (useOverdraft.equals("N")|| useOverdraft.equals("N")){
            overDraftResult = false;
            return;
        }else{
            System.out.println("Invalid option");
            return;
        }

        balance = balance - value;
        System.out.println("Bank slip paid!");
    }

    public void checkUseOverdraft(){
        if (overDraftResult == true){
            System.out.println("You used your special payment slip.");

        }else{
            System.out.println("You didn't use your special payment slip.");
        }
    }



    //Getters and setters:

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }
}


