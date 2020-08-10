package day41_Inheritance.Task01;
/*
Task:
	creata  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
	create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			create a constructor that can initialize all the attributes of Tester
	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     create a constructor that can initialize all the attributes of developer
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		create a constructor that can initialize all the attributes of businessAnalyst
     		*/
public class Employee {

    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString(){
        return "Name: "+", Id: "+id+", Job Title: "+jobTitle+", Gender: "+gender+", Salary: $"+salary;
    }



}
