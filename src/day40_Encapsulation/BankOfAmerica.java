package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        EmployeeInfo Huri = new EmployeeInfo();
        Huri.setAddress("Virginia");
        Huri.setSalary(120000.00);

        System.out.println(Huri.getAddress());
        System.out.println(Huri.companyName);// companyName static oldugu icin set e gerek yok
        System.out.println(Huri.getSalary());
    }
}
