package BankAccount;

/*
 * Bank Account object
 * 
 * @author Mike Delmonaco
 * @author Steve Milonas
 * @version 1-5-17
 */
public class BankAccount {
    private String name;
    private double balance, interest; //interest default
    
    public BankAccount(String myName, double myBalance){
        name = myName;
        balance = myBalance;
    }
    
    public String toString(){
        return "name: "+name+". balance: $"+balance+". interest: "+interest;
    }
    
    public void deposit(double money){
        balance+=money;
    }
}
