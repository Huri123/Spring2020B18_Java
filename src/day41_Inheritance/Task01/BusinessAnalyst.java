package day41_Inheritance.Task01;

import day41_Inheritance.Task01.Employee;

/*
 create subclass of employee name it business analyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		create a constructor that can initialize all the attributes of businessAnalyst
 */
public class BusinessAnalyst extends Employee {
/*
 name (inherited)
    salary (inherited)
    id (inherited)
    jobTitle (inherited)
    gender (inherited)

    writingRequirements()
    gathering()
    toString() (inherited)
 */
public BusinessAnalyst(String name,double salary, long id,char gender){
    this.name=name;
    this.salary=salary;
    this.id=id;
    jobTitle="Business Analyst";//this. keyworde de gerek yok//paranteze yazmayip buraya yazarsan jobTitle daima Business Analylist olacak demektir
    this.gender=gender;
}

    public void writingRequirements(){
        System.out.println(name+" is writing requirements");
    }
    public void gathering(){
        System.out.println(name+" is gathering requirements");
    }

}
