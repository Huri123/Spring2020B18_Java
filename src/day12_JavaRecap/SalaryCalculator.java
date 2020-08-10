package day12_JavaRecap;

import java.util.Scanner;

/*
 ask the user enter salary
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your company name: ");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN = input.nextLong();//123456 + enter

        input.nextLine(); //nextlong sadece sayiyi aldi. enter kaldi. onu da
                            // bir sonraki nextline almasin diye bunu koyduk

        System.out.println("Enter Job Title: ");
        String jobTitle = input.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job Title is: "+jobTitle);
        System.out.println("Company Name: "+companyName);
        System.out.println("SSN: "+SSN);
        System.out.println("Salary is: $"+salary);

    }
}
