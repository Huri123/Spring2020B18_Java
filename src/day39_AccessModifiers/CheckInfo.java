package day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {

        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Gender: "+PersonalInfo.gender);

        System.out.println("Grade: "+PersonalInfo.grade); //grade is default so it is accessible in the same package
        System.out.println("Age: "+PersonalInfo.age); //age is default so it is accessible in the same package

        // System.out.println("SSN: "+PersonalInfo.SSN); //SSN is private so it gives compile error private is only accessible with the same class
       // System.out.println("ID: "+PersonalInfo.ID); //ID is private so it gives compile error

   PersonalInfo obj=new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

        System.out.println(obj.grade);
        System.out.println(obj.age);

        //System.out.println(obj.SSN); //private cannot be accessed outside the class
        //System.out.println(obj.ID); //private cannot be accessed outside the class


    }
}
