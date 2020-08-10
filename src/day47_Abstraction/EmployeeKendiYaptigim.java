package day47_Abstraction;

/*
Task02:
		1. create an abstract class called Employee
				attributes: name, age, gender, salary, jobtitle
				methods:
						abstract methods: work()
						instance method: toString()
		2. create two sub classes of the Employee:
									1. Tester
									2. Developer
					each class MUST have constructors to initialize the attributes
 */
public abstract class EmployeeKendiYaptigim {

    public String name;
    public int age;
    public char gender;
    public double salary;
    public String jobTitle;

    public abstract void work();

    public String toString() {
        return "Name: " + name + ",age: " + age + ", gender: " + gender + ", salary: " + salary + "job title: " + jobTitle;
    }

}

class Tester extends EmployeeKendiYaptigim {

    public Tester(String name, int age, char gender, double salary, String jobTitle) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;

    }

    @Override
    public void work() {
        System.out.println(name + " is working.");
    }
}

class Developer extends EmployeeKendiYaptigim {

    public Developer(String name, int age, char gender, double salary, String jobTitle) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;

    }

    @Override
    public void work() {
        System.out.println(name + " is working.");
    }
}

class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester = new Tester("Sarah", 30, 'F', 100000, "QA");
        System.out.println(tester);
        tester.work();

        Developer developer = new Developer("Alex", 35, 'M', 110000, "SDET");
        System.out.println(developer);
        developer.work();

    }
}
