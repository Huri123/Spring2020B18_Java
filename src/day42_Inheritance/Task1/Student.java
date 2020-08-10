package day42_Inheritance.Task1;
/*
create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
 */
public class Student extends Person{
    /*
    name (inherited)
    age (inherited)
    gender (inherited)
    studentID
    clazz

    setPersonInfo() (inherited)
    eat() (inherited)
    sleep() (inherited)
    walk() (inherited)
    drink() (inherited)

    setStudentInfo
    attendClass
    code
    toString
     */
    public long studentID;
    public String clazz;
    public static String schoolName="Harward";


public void setStudentInfo(String name,int age,char gender,long studentID,String clazz){
    setPersonInfo(name,age,gender);//this method is in the Person class. it initializes name,age,gender.
                // through inheritance we just call this method instead of initializing each one by one
    this.studentID=studentID;
    this.clazz=clazz;
}
public void attendClass(){
    System.out.println(name+" is attending "+clazz);
}
public void code(){
    System.out.println(name+" is coding");
}
    public String toString(){
        return "Name: "+name+", ID: "+studentID+",  age: "+age
                +", gender: "+gender+", class: "+clazz+", school: "+schoolName;
    }



}
