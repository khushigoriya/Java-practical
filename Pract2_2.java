/*
 * ID: 21CE035
 * NAME: KHUSHI GORIYA
 * AIM: Design a class named Account that contains:
 * •A private int data field namedid for the account (default 0).
 * •A private double data field named balance for the account (default 500₹).
 * •A  private  double  data  field  named  annualInterestRate  that  stores  the  currentinterest rate (default 7%). 
 * Assume all accounts have the same interest rate.
 * •A  private  Date  data  field  named  dateCreated  that  stores  the  date  when  theaccount was created.
 * •A no-arg constructor that creates a default account.
 * •A constructor that creates an account with the specified id and initial balance.
 * •The accessor and mutator methods for id, balance, and annualInterestRate.
 * •The accessor method for dateCreated.
 * •A method named getMonthlyInterestRate() that returns the monthlyinterest rate.
 * •A method named getMonthlyInterest() that returns the monthly interest.
 * •A method named withdraw that withdraws a specified amount from theaccount.
 * •A method named deposit that deposits aspecified amount to the account.
 */
import java.util.Date;
import java.util.Scanner;
public class Pract2_2 {
        public static void main(String[] args)
        {
            Date D = new Date();
            Account A = new Account();
            System.out.println("Enter your Account ID : ");
            Scanner s = new Scanner(System.in);
            A.setId(s.nextInt());
            System.out.println("Enter your Balance : ");
            A.setBalance(s.nextDouble());
            System.out.println("Enter your Annual Interest : ");
            A.setAnnualInterestRate(s.nextDouble());
            System.out.println("-----------------------------------------");
            System.out.println("Account ID : " + A.getId());
            System.out.println("Balance : " + A.getBalance());
            System.out.println("Date : " + D );
            System.out.println("Monthly Interest Rate : " + A.getMonthlyInterestRate());
            System.out.println("Monthly Interest : " + A.getMonthlyInterest());
            int flag = 1;
            while(flag == 1)
            {
                System.out.println("Enter 1 for Withdrawal and 2 for Deposit : ");
                int n = s.nextInt();
                switch (n) {
                    case 1 ->
                    {
                        System.out.println("Enter the Amount you want to Withdraw : ");
                        double temp=s.nextDouble();
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Updated Balance is : " + A.Withdraw(temp));
                        A.setBalance(A.Withdraw(temp));
                    }
                    case 2 ->
                    {
                        System.out.println("Enter the Amount you want to Deposit : ");
                        double temp=s.nextDouble();
                        System.out.println("Deposit Successful!");
                        System.out.println("Updated Balance is : " + A.Deposit(temp));
                        A.setBalance(A.Deposit(temp));
                    }

                    default -> {
                        System.out.println("Please Select a Valid Operation.");
                        break;
                    }
                }
                System.out.println("If you want to continue enter 1, or Exit =0:");
                flag = s.nextInt();
                if(flag==0)
                {
                    break;
                }
            }
            s.close();
        }
}
