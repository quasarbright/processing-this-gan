package BankAccount;

/**
 * creates a bank account object
 * 
 * @author mike delmonaco steve milonas
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
    
    /**
     * deposits money from account
     * 
     * @param money money to be deposited
     */
    @Override
    public void deposit(double money) {
        super.deposit(money);
        transNum++;
    }
    
    /**
     * withdraws money from account
     * 
     * @param money money to be withdrawn
     */
    @Override
    public void withdraw(double money){
        super.withdraw(money);
        transNum++;
    }
    
    /**
     * represents object as a string
     * 
     * @return name, balance, number of transactions
     */
    @Override
    public String toString(){
        return super.toString()+". transactions: "+transNum;
    }
    
    /**
     * number of transactions
     * 
     * @return number of transactions
     */
    public int getTransNum(){
        return transNum;
    }
    
    /**
     * ends the month and returns monthly cost
     * for transaction fee
     * 
     * @return transaction fee
     */
    public double endOfMonth(){
        return transNum*.5;
    }
    
}
