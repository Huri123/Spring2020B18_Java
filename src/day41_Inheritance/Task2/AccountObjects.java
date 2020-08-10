package day41_Inheritance.Task2;

public class AccountObjects {
    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();
        obj.accountHolder = "Saban";

        obj.showBalance();
        System.out.println(obj);

        obj.deposit(25000);
        obj.showBalance();

        obj.withdraw(10000);
        obj.showBalance();

        System.out.println(obj);

        System.out.println("===================================================");

        SavingAccount saving=new SavingAccount();
        saving.accountHolder="Huri";

       // System.out.println(saving.interestRate); alttakiyle ayni classname ile de cagirabiliriz
        System.out.println(SavingAccount.interestRate);

        System.out.println(saving);

        saving.deposit(3000);
        saving.showBalance();

       // saving.withdraw(); error it is in the checkingAccount




    }

}
