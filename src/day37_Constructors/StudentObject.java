package day37_Constructors;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Marine",34,'F',"Cybertek");
       // student1.setInfo("Marine",34,'F',"Cybertek");

        System.out.println(student1);//Student class da toString method olmasi lazim

        Student student2=new Student("Sha",34,'M',"Harvard");
        System.out.println(student2);



    }






}
