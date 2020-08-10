package OfficeHours.Practice_05_06_2020;

/*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
 */

public class Tester {
    String name;
    String jobTitle;
    double salary;
    long employeeId;

    public void setInfo(String name, String jobTitle, double salary, long employeeId){
        this.name =  name;  // user given argument name is assigned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeId = employeeId;

    }

    public String toString(){

        return "Name: "+name+", job title: "+jobTitle
                +", salary: $"+salary+", ID: "+employeeId;
    }

    public void smokeTesting(){
        System.out.println(name+" is doing smoke test");//this.name de yapabilirdik
    }
    /*
    public void smokeTesting(){
    int name=0;
        System.out.println(name+" is doing smoke test");//name local variable olarak da bulunabilirdi. o yuzden this.name  yapmaliyiz boyle oluca
    localde instance variable ile ayni isimde variable varsa basina this koymazsan direkt localdekini alir
    }

     */

    public void creatingTicket(){

        System.out.println( this.name +" is creating ticket on Jira");
    }



}
