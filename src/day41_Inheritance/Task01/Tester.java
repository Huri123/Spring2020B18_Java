package day41_Inheritance.Task01;

import day41_Inheritance.Task01.Employee;

/*
create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			create a constructor that can initialize all the attributes of Tester
 */
public class Tester extends Employee {
    /*
    name (inherited)
    salary (inherited)
    id (inherited)
    jobTitle (inherited)
    gender (inherited)

    reporting()
    testing()
    toString()  (Inherited)
     */
    public Tester(String name,double salary, long id, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public void reportingBug(){
        System.out.println(name+ " is reporting bug");
    }

    public void testing(){
        System.out.println(name+ " is testing");
    }

}
