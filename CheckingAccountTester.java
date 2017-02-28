package BankAccount;

/**
 * tests BankAccount classes
 * 
 * @author mike delmonaco steve milonas
 * @version 2-16-17
 */
public class Tester {
    public static void main(String[] args) {
        CheckingAccount ghoul = new CheckingAccount("Kaneki", 1000, 0);
        
        ghoul.withdraw(7);
        ghoul.withdraw(7);
        ghoul.withdraw(7);
        
        ghoul.deposit(350.00);
        ghoul.deposit(31.41);
        
        ghoul.endOfMonth();
    }
}
