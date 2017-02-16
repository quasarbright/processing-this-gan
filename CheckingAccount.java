package BankAccount;

/**
 * creates a bank account object
 * 
 * @author mdelmonaco
 * @version 2-16-17
 */
public class CheckingAccount extends BankAccount {
    private int transNum;
    
    /**
     * creates checking account object
     * 
     * @param myName account holder's name
     * @param myBalance initial balance
     * @param myTransNum number of transactions
     */
    public CheckingAccount(String myName, double myBalance, int myTransNum){
        super(myName, myBalance);
        transNum = myTransNum;
    }
    
    public void deposit(super money) {
        transNum++;
    }
    
}
