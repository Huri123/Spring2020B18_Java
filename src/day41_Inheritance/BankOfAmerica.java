package day41_Inheritance;

public class BankOfAmerica {

    public static void main(String[] args) {
        BankAccount Irina = new BankAccount("Irina", "Li");
        //System.out.println(Irina.accountHolder);//compiler error because it is private. we cannot call directly private
        System.out.println(Irina.getAccountHolder());

        System.out.println(Irina.getBalance());
        Irina.checkBalance();
        Irina.depositing(120);
        Irina.checkBalance();
        Irina.withdrawing(80);
        Irina.checkBalance();
        System.out.println(Irina);

        Irina.withdrawing(100);
        System.out.println(Irina);
        Irina.depositing(200000);
        System.out.println(Irina);



    }


}
