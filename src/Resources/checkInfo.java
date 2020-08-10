package Resources;

import day39_AccessModifiers.PersonalInfo;

public class checkInfo {
    public static void main(String[] args) {

        System.out.println(PersonalInfo.name);// to access give import statement
        System.out.println(PersonalInfo.gender);

        //System.out.println(PersonalInfo.grade);//default can not be accessed outside the package
        //System.out.println(PersonalInfo.age);  //default can not be accessed outside the package

       //System.out.println(PersonalInfo.SSN); //Private is only accessible in the same class
        //System.out.println(PersonalInfo.ID); // Private is only accessible in the same class

    PersonalInfo obj=new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

        //System.out.println(obj.grade);//default //default can not be accessed outside the package
        //System.out.println(obj.age);//default //default can not be accessed outside the package

        //System.out.println(obj.SSN); //Private is only accessible in the same class
        //System.out.println(obj.ID)  //Private is only accessible in the same class




    }
}
