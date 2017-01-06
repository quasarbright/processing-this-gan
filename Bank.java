/**
 * Bank main class. Makes and uses accounts
 * 
 * @author Mike Delmonaco
 * @author Steve Milonas
 * @version 1-5-17
 */
 public class Bank{
    public static void main(String[] args){
    	BankAccount treeFiddy = new BankAccount("Tree Fiddy", 0.00);
    	BankAccount unravel = new BankAccount("Kaneki", 1000.00);
     
     System.out.println(treeFiddy.toString());
     System.out.println(unravel.toString());
     
     treeFiddy.deposit(31.41);
     unravel.withdraw(7.00);
     
     System.out.println(treeFiddy.toString());
     System.out.println(unravel.toString());
     
     treeFiddy.deposit(31.41);
     treeFiddy.withdraw(10.00);
     unravel.withdraw(7.00);
     unravel.withdraw(7.00);
     unravel.withdraw(7.00);
     unravel.withdraw(7.00);
     
     System.out.println(treeFiddy.toString());
     System.out.println(unravel.toString());
     
     unravel.deposit(7.00);
     
     System.out.println(treeFiddy.toString());
     System.out.println(unravel.toString());
    }
 }
