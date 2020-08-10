package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Adam", "England", 34, 3.5, 'M', true);
        //System.out.println(student1);//whenever we print object in print statement it automatically accepts toString
        //method. bu yuzden student class a to string method yazdik

        Student student2 = new Student();
        student2.setStudentInfo("Mike", "German", 30, 3.0, 'M', false);

        Student student3 = new Student();
        student3.setStudentInfo("Johnny Guitar", "US", 40, 2.5, 'M', false);

        Student student4 = new Student();
        student4.setStudentInfo("Anna", "Ukrainian", 33, 3.9, 'F', true);

        Student[] students = {student1, student2, student3, student4};

        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));//print out the names of whom can graduate
        canGraduate.removeIf(p -> p.gpa <= 3.0); //gpa 3.0 dan kucukse ve esitse listten remove olacak
        System.out.println(canGraduate.size());

        for (int i = 0; i < canGraduate.size(); i++) {
            Student each = canGraduate.get(i);//get is used for retrieving
            //System.out.println(each); //herseyi istiyorsan boyle
            System.out.println(each.name); //sadece adini istiyorsan boule yap
        }
        System.out.println("==============================================================");
        ArrayList<Student> canNotGraduate = new ArrayList<>(Arrays.asList(students));//print out the names of whom cannot graduate
        canNotGraduate.removeIf(p -> p.gpa > 3.0); //gpa 3.0 dan buyukse listten remove olacak
        System.out.println(canNotGraduate.size());

        for (Student each:canNotGraduate) {//print out the names of whom can graduate
            //System.out.println(each); //herseyi istiyorsan boyle
            System.out.println(each.name+" can not graduate");




        }
    }
}
/*
Muhtar'in kodlari
import java.util.ArrayList;
import java.util.Arrays;

public class StudentsObjects {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Adam", "Englad", 34,3.5, 'M',true);

       Student student2 = new Student();
       student2.setStudentInfo("Mike","German",30,3.0,'M',false);

       Student student3 = new Student();
        student3.setStudentInfo("Johnny Guitar", "US",40,2.5,'M',false );

        Student student4 = new Student();
        student4.setStudentInfo("Anna","Ukrainian", 33,3.9, 'F', true);

        Student[] students = {student1, student2, student3, student4};


        ArrayList<Student> canGraduate = new ArrayList<>( Arrays.asList(students) );
        canGraduate.removeIf( p -> p.gpa <= 3.0 );

        System.out.println(canGraduate.size());

        for( int i = 0; i < canGraduate.size(); i++){
           Student each = canGraduate.get(i);
            System.out.println( each.name +" can graduate");
        }

        System.out.println("=========================================================");

        ArrayList<Student> canNotGraduate = new ArrayList<>(  Arrays.asList(students) );
        canNotGraduate.removeIf( p -> p.gpa > 3.0);
        System.out.println(canNotGraduate.size());

        for( Student each : canNotGraduate){
            System.out.println(each.name+" can not graduate");
        }





    }


}
 */
