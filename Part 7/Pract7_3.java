/**
 * NAME:KHUSHI GORIYA
 * ID:21CE035
 * Personal Loan Eligibility Criteria for Salaried Applicant is as follows: Eligible Age Group - 21 years to 60 years
Minimum Net Monthly Income - Rs. 15,000
Minimum Total Work Experience - 1 year 
Citizenship – Indian 
Create a class AccountHolder to store above given information entered by a user. Create 5 objects of AccountHolder class and store them in an ArrayList. Display names of account holders , who are eligible to get a loan based on given criteria. 
 
 */
import java.util.ArrayList;
import java.util.Scanner;

class AccountHolder
{
    int age;
    double income;
    float experience;
    String citizenship;
    boolean eligiblity;
    AccountHolder(int age, double income, float experience, String citizenship)
    {
        this.age=age;
        this.income=income;
        this.experience=experience;
        this.citizenship=citizenship;
    }
    public String eligiblity()         
    {
        if(age>=21 && age<=60 && income>=15000 && experience>=1 && citizenship.equals("India"))
        {
            System.out.println("Account details: ");
            System.out.println("Age: " + this.age);
            System.out.println("Income: " + this.income);
            System.out.println("Experience: " + this.experience);
            System.out.println("Citizenship: " + this.citizenship + "n");
            return "eligible.";
        }
        else
        {
            return "not eligible.";
        }
    }
}

public class Pract7_3 
{
    public static void main(String[] args) 
    {
        ArrayList<AccountHolder> ah = new ArrayList<>();
        int i=1;
        while(i<6)
        {
            System.out.print("\nEnter Details of Account Holder " + i + ":\n");
            System.out.print("Enter age: ");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();
            System.out.print("Enter net monthly income: ");
           double income = input.nextDouble();
            System.out.print("Enter work experience in years: ");
            float experience = input.nextFloat();
            System.out.print("Enter name of your country: ");
            String citizenship = input.next();
            ah.add(new AccountHolder(age, income, experience, citizenship));
            i++;
        }
        for(int j=1; j<ah.size()+1; j++)
        {
            System.out.println("\nAccount Holder " + j + " is " + ((AccountHolder) ah.get(j-1)).eligiblity());
        }
    }
}    
