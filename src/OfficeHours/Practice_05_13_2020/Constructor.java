package OfficeHours.Practice_05_13_2020;
//Constructor object olusturduktan sonra calisir
public class Constructor {
    public Constructor(){
        System.out.println("default constructor");
    }
    public static void main(String[] args) {
        Constructor obj =new Constructor();//after we created obj print statement will run.
        System.out.println("=========================================");

        Employee employee1=new Employee("Canan",123,120000);
        System.out.println(employee1.name);
        System.out.println(employee1.id);
        System.out.println(employee1.salary);

        Employee employee2=new Employee("Reem",456,150000);
        System.out.println(employee2);//we need to toString method that speficies how to write it
    }
}


class Employee{
    String name;
    long id;
    double salary;

    public Employee(String name,long id,double salary){
        this.name=name;//we must assign variables through "this." keyword.if not they will not be initialized and give default value
        this.id=id;
        this.salary=salary;
    }

    public String toString(){
        return "Name: "+name+", id: "+id+", salary: "+salary;
    }

}