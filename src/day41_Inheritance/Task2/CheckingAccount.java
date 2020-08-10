package day41_Inheritance.Task2;
/*
create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
 */
public class CheckingAccount extends BankAccount{
    /*
    accountNumber (inherited)
    accountHolder (inherited)
    balance (inherited)

    deposit (inherited)
    showBalance (inherited)
    toString (inherited)
    withdraw
     */
    public void withdraw(int amount){//we can not withdraw decimal. can whole number so it is int
        balance-=amount;
    }
}
