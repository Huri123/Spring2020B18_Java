package day41_Inheritance;
/*
WarmUp tasks:
	create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance

	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)

	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance//it is for reading the object
 */
public class BankAccount {
    //static String bankName="Bank of America";//default access modifier
    public static String bankName="Bank of America";//public access modifier.public is visible everywhere
    public String firstName;
    public String lastName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.accountHolder=firstName+" "+lastName;
    }

    public String getAccountHolder(){//accountHolder static olasaydi bu method da static olurdu.
        return accountHolder;
    }

    public void setAccountHolder(String firstName,String lastname){//accountHolder static olasaydi bu method da static olurdu.//this method is void because we just wanna initialize something
        this.accountHolder=firstName+" "+lastname;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //original=100
    //deposit=20
    //new balance=120
    public void depositing(int amount){//the money that deposit needs to be whole number int
        //balance+=amount;
        setBalance(balance+amount);//2.way
    }

    public void withdrawing(int amount){//ask information the money that youare withdrawing.so we write parameter amount in the paranthesis
        // balance-=amount;
        setBalance(balance-amount);
    }

    public void checkBalance(){
        //System.out.println("Available balance: "+balance);
        System.out.println("Available balance: "+getBalance());
    }

    public String toString(){
        return "Full Name: "+getAccountHolder()+",Balance: "+getBalance();
    }











}
