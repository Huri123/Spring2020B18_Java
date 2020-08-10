package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

/*
 /*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers
        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only

          */
public class AppleINC2 {

        public static void main(String[] args) {
            Tester tester1 = new Tester();
            tester1.setInfo("Onur","Junior Tester",75000,1234);
            Tester tester2 = new Tester();
            tester2.setInfo("Elton John","Junior Tester",75000,1245);
            Tester tester3 = new Tester();
            tester3.setInfo("Rahman","SDET",120000,22222);
            Tester tester4 = new Tester();
            tester4.setInfo("Jon", "SDET", 115000, 98765);
            Developer dev1 = new Developer();
            dev1.setInfo("Barzy","Senior Developer",120200,1122337);
            Developer dev2 = new Developer();
            dev2.setInfo("Emrah", "Usta Developer", 100000,223232);
            Developer dev3 = new Developer();
            dev1.setInfo("Aaron","Senior Developer",120000,112233);
            Developer dev4 = new Developer();
            dev2.setInfo("Daniel", "Usta Developer", 110000,334455);
            ScrumTeam scrum1 = new ScrumTeam();
            scrum1.hireATester(tester1);
            scrum1.hireATester(tester2);
            scrum1.hireATester(tester3);
            scrum1.hireADeveloper(dev1);
            scrum1.hireADeveloper(dev2);
            scrum1.hireADeveloper(dev3);
            ScrumTeam scrum2 = new ScrumTeam();
            scrum2.hireATester(tester3);
            scrum2.hireATester(tester4);
            scrum2.hireADeveloper(dev1);
            scrum2.hireADeveloper(dev2);
            scrum2.hireADeveloper(dev3);
            scrum2.hireADeveloper(dev4);
            ScrumTeam scrum3 = new ScrumTeam();
            scrum2.hireATester(tester3);
            scrum2.hireATester(tester4);
            scrum3.hireATester(tester1);
            scrum2.hireADeveloper(dev1);
            scrum2.hireADeveloper(dev2);
            ScrumTeam[] arr = {scrum1, scrum2, scrum3};
        /*
         1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
         */
            for(int i=0; i < arr.length; i++){
                if(arr[i].devpTeam.get(i).salary < 120000){
                    System.out.println("Developer name: "+arr[i].devpTeam.get(i).name);
                }
                if(arr[i].testersTeam.get(i).salary > 120000){
                    System.out.println("Tester Name: "+ arr[i].testersTeam.get(i).name );
                }
            }
            ArrayList<ScrumTeam> ScrumList = new ArrayList<>(Arrays.asList());

        /*
          1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
         */
            for(int i=0; i < ScrumList.size(); i++){
                ScrumTeam eachScrum = ScrumList.get(i);
                Tester eachTester = eachScrum.testersTeam.get(i);
                Developer eachDeveloper = eachScrum.devpTeam.get(i);
                long testerID = eachTester.employeeId;
                long developerId = eachDeveloper.employeeId;
                double testerSalary = eachTester.salary;
                double developerSalary = eachDeveloper.salary;
                if(testerSalary < 100000){
                    eachScrum.fireATester(testerID);
                }
                if(developerSalary < 120000){
                    eachScrum.fireADeveloper(developerId);
                }
            }
        }
    }


