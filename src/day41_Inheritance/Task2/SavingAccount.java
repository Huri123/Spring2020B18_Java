package day41_Inheritance.Task2;
/*
create sub class of BankAccount and name it SavingAccount
			variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance
 */
public class SavingAccount extends BankAccount{
    /*
    accountNumber (inherited)
    accountHolder (inherited)
    balance (inherited)

    interestRate

    deposit (inherited)
    showBalance (inherited)
    toString (inherited)
     */
    public static double interestRate;

    static{
        interestRate=0.02;
    }
}
