// J77-10533-2024 Salome Nyaboke
import java.util.Scanner;

//superclass
class BankAccount{
    double balance;

    void deposit(double amount){
        balance= balance + amount;
    }
}
//subclass
class SavingsAccount extends BankAccount{
    void addIntrest () {
        double intrest =balance *0.05;
        balance= balance+ intrest;
        
    } 
    }
//The main class
public class Main {
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        //savings account object
        SavingsAccount Myaccount= new SavingsAccount();
        // ask user to enter deposit
        System.out.println("Enter amount to deposit:");
        double amount=input.nextDouble();
        //deposit the money
        Myaccount.deposit(amount);
        // add the intrest
      Myaccount.addIntrest();
        //display balance
        System.out.println("Your balance is:"
        +Myaccount.balance);
    } 
    }
