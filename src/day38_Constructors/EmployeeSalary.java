package day38_Constructors;

public class EmployeeSalary {
    public static void main(String[] args) {
        SalaryCalculator Zareen = new SalaryCalculator(50, 40, 8.25 / 100, 0.2);
        System.out.println(Zareen.salary());
        System.out.println(Zareen);

        System.out.println("=================================================================");
        SalaryCalculator Namik = new SalaryCalculator(62, 40, 8.75 / 100, 0.26);
        System.out.println(Namik);
        System.out.println( Namik.salaryAfterTax() );


    }
}
