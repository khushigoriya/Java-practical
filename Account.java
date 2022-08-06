import java.util.Date;

// import javax.swing.JSpinner.DateEditor;

class Account {
    private int  Id;
    private double Balance;
    private double AnnualInterestRate;
    private Date DateCreated;
    // double Withdraw,Deposit;
    Account() 
    {
        Id = 0;
        Balance = 500;
        AnnualInterestRate = 0.07;
    }
    Account(int  Id, Double Balance)
    {
        this.Id=Id;
        this.Balance=Balance;
        DateCreated=new Date();
    }

    public void setId(int  Id) 
    {
        this.Id = Id;
    }

    public double getId() 
    {
        return Id;
    }

    public void setDateCreated(Date dateCreated) 
    {
        DateCreated = dateCreated;
    }

    public Date getDateCreated() 
    {
        return DateCreated;
    }

    public void setBalance(double Balance) 
    {
        this.Balance = Balance;
    }

    public double getBalance() 
    {
        return Balance;
    }

    public void setAnnualInterestRate(double AnnualInterestRate)
    {
        this.AnnualInterestRate = AnnualInterestRate;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }
    // public String getDateCreated() {
	// 	return dateCreated.toString();
	// }
    double Withdraw(double Withdraw)
    {
        return(Balance-Withdraw);

    }
    double Deposit(double Deposit)
    {
        return(Balance+Deposit);
    }
    double getMonthlyInterestRate()
    {
        return((AnnualInterestRate/100)/12);
    }
    double getMonthlyInterest()
    {
        return(getMonthlyInterestRate()*Balance);
    }
    public String toString() {
		return "\nAccount ID: " + Id + "\nDate created: " + getDateCreated()
			+ "\nBalance: " + String.format("%.2f", Balance) + 
			"\nMonthly interest: " + String.format("%.2f", getMonthlyInterest());
	}
}




/********************************************************
*                     Account                           *
*-------------------------------------------------------*
* -id: int                                              *
* -balance: double                                      *
* -annualInterestRate: double                           *
* ---------------------------                           *
* -dateCreated: String                                  *
* +Account()                                            *
* +Account(newid: int, newBalance: double)              *
* +setId(newId: int)                                    *
* +setBalance(newBalance: double)                       *
* +setAnnualInterestRate(newAnnualInterestRate: double) *
* +getId(): int                                         *
* +getBalance(): double                                 *
* +getAnnualInterestRate(): double                      *
* +getDateCreated(): String                             *
* +getMonthlyInterestRate(): double                     *
* +getMonthlyInterest(): double                         *
* +withdraw(amount: double)                             *
* +deposit(amount: double)                              *
********************************************************/

// Implement the Account class
