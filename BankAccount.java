import java.util.Scanner;
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit successful. New balance : $"+balance);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdrawal successful. new balance: $"+balance);
        }else{
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
}