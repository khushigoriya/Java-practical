
/*
* ID: 21CE035
*NAME : KHUSHI GORIYA
*(Subclasses of Account) In Programming Exercise 9.7, the Account class was     
*defined to model a bank account. An account has the properties account number, 
* balance, annual interest rate, and date created, and methods to deposit and    
* withdraw funds. Create two subclasses for checking and saving accounts. A      
* checking account has an overdraft limit, but a savings account cannot be       
* overdrawn.                                                                                                                                            
* Draw the UML diagram for the classes and then implement them. Write            
* a test program that creates objects of Account, SavingsAccount, and            
* CheckingAccount and invokes their toString() methods.                          
*/
public class Pract2_4 {
	public static void main(String[] args) {
		
		Account account = new Account(01, 20000.0);
		SavingsAccount savings = new SavingsAccount(02, 20000);
		CheckingAccount checking = new CheckingAccount(03, 20000, -20);
    	account.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);

		
		account.Withdraw(2500);
		savings.Withdraw(2500);
		checking.Withdraw(2500);
		account.Deposit(3000);
		savings.Deposit(3000);
		checking.Deposit(3000);
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}
