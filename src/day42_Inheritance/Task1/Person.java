package day42_Inheritance.Task1;

/*
task01:
		create a class called Person
				attributes:  name, age, gender
				methods: eat, walk, sleep, setPersonInfo
		create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
		create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
		create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
		create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
 */
public class Person {

    public String name;
    public int age;
    public char gender;

    public void setPersonInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food) {//pararntez bos ta olabilir farketmez
        System.out.println(name + " is eating " + food);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void drink(String drink) {//method can be either with arguments or without arguments
        System.out.println(name + " is drinking " + drink);
    }


}
