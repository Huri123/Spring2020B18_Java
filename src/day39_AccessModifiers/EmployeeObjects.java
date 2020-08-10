package day39_AccessModifiers;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Rustem");
        System.out.println(employee1); //to print object we need toString method in custom method

        Employee employee2 = new Employee("john", "Mechanic");
        System.out.println(employee2);

        Employee employee3 = new Employee("Sarah", "SDET", 123);
        System.out.println(employee3);

        Employee employee4 = new Employee("Ozgur", "SDET", 456, 120000);
        System.out.println(employee4);

        Employee employee5 = new Employee("Huri", "SDET", 789, 120005, 'F');
        System.out.println(employee5);
    }
}
