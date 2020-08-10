package day41_Inheritance.Task01;

import day41_Inheritance.Task01.Employee;

/*
create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     create a constructor that can initialize all the attributes of developer
 */

public class Developer extends Employee {
/*
 /*
    name (inherited)
    salary (inherited)
    id (inherited)
    jobTitle (inherited)
    gender (inherited)

     fixingBug()
     coding()
     toString() (inherited)
 */


    public Developer(String name,double salary, long id, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public void fixingBug(){//this method is only unique for developer class
        System.out.println(name+" is fixing the bug");
    }
    public void coding(){//this method is only unique for developer class
        System.out.println(name+" is coding");
    }
}
