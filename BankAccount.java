/**
 * Bank Account object
 * 
 * @author Mike Delmonaco
 * @author Steve Milonas
 * @version 1-5-17
 */
public class BankAccount {
    private String name;
    private double balance;
    
    /**
     * Constructor. Creates a bank account with a name and balance
     *
     * @param myName  String containing the account owner's name
     * @param myBalance  the account balance
     */
    public BankAccount(String myName, double myBalance){
        name = myName;
        balance = myBalance;
    }
    
    /**
     * Represents the bank account object as a string
     * 
     * @return String containing the owner's name and balance
     */
    public String toString(){
        return "name: "+name+". balance: $"+balance;
    }
    
    /**
     * withdraws money from bank account
     *
     * @param money  the amount of money to be withdrawn
     */
    public void withdraw(double money) {
        balance = balance - money;
    }
    
    /**
     * deposits money to bank account
     *
     * @param money  the amount of money to be deposited
     */
    public void deposit(double money){
        balance+=money;
    }
}
