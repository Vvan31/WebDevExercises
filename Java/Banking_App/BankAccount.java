package Banking_App;

import java.util.Scanner;

public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerPassword;

    // new BankAccount() //no args
    public BankAccount() {

    }

    // new BankAccount("hoge", "password") //with args
    public BankAccount(String customerName, String customerPassword) {
        this.balance = 0;
        this.previousTransaction = 0;
        this.customerName = customerName;
        this.customerPassword = customerPassword;
    }

    // BankAccount ba = new BankAccount("hoge", "password")
    // ba.getCustomerName() // "hoge"
    // ba.customerName; //compile error
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * deposit
     * withdraw
     * getPreviousTransaction x
     * errorMessage x
     * showMenu x
     * exitAccount x
     */

    // ba.deposit("100") //compile error - invalid args (datatype)
    // ba.deposit(100)
    void deposit(int amount) {
        if(amount > 0){
            balance = balance + amount;
            previousTransaction = amount;
        }else{
            errorMessage("Invalid amount! Please enter correct amount.");
        }
    }

    void withdraw(int amount) {
        if(amount > 0 && balance >= amount){
            balance = balance - amount;
            previousTransaction = -amount;
        }else{
            if(amount <= 0){
                errorMessage("Invalid amount! Please enter correct amount.");
            }else{
                errorMessage("Insufficient Balance!");
            }
        }
    }

    void getPreviousTransaction() {
        if(previousTransaction > 0){
            //deposit
            System.out.println("Deposited: $"+ previousTransaction);
        }else if(previousTransaction < 0){
            //withdrawal
            System.out.println("Withdrew: $"+ Math.abs(previousTransaction));
        }else{
            System.out.println("No transaction.");
        }
    }

    void errorMessage(String message) {
        System.out.println(message);
    }

    void showMenu(){
        char option;
        try (Scanner input = new Scanner(System.in)) {

            do{

                System.out.println(
                    "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n"+
                    "Select an option from the menu\n"+
                    "A: Check your balance\n"+
                    "B: Make a Deposit\n"+
                    "C: Withdraw\n"+
                    "D: Previous Transaction\n"+
                    "E: Quit\n"+
                    "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*="
                );
                option = input.next().charAt(0); // [a]sdasdads sgasgagsasf

                ATM.clrscr();

                switch (Character.toLowerCase(option)) {
                    case 'a':
                        System.out.println("-------------------------------");
                        System.out.println("Your balance is: " + balance);
                        System.out.println("-------------------------------");
                        break;
                    case 'b':
                        System.out.println("-------------------------------");
                        System.out.println("Enter an amount to deposit");
                        System.out.println("-------------------------------");

                        try{
                            int amount = input.nextInt();
                            deposit(amount);
                        }catch(Exception e){
                            errorMessage("Wrong Input! Only integers please");
                        }

                        break;
                    case 'c':
                        System.out.println("-------------------------------");
                        System.out.println("Enter an amount to withdraw");
                        System.out.println("-------------------------------");

                        try{
                            int amount = input.nextInt();
                            withdraw(amount);
                        }catch(Exception e){
                            errorMessage("Wrong Input! Only integers please");
                        }

                        break;
                    case 'd':
                        System.out.println("-------------------------------");
                        System.out.println("Previous Transaction");
                        System.out.println("-------------------------------");
                        getPreviousTransaction();

                        break;
                
                    default:
                        System.out.println("Invalid option. Please try again");
                        break;
                }

            }while(Character.toLowerCase(option) != 'e');

            System.out.println("Thank you for banking with us! See you again....");
            System.exit(0);
        }
     }

}