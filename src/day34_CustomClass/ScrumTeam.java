package day34_CustomClass;

import java.util.ArrayList;

public class ScrumTeam {
ArrayList<Tester>testersTeam=new ArrayList<>();
public void hireTester(Tester tester){// testerTeam arrayList i baz aliyoruz.ona ekliyoruz fire yaparken de cikariyoruz.
    testersTeam.add(tester);
}
    public void fireTester(long employeeID){
    testersTeam.removeIf(p->p.employeeID==employeeID);
    }

}
/*
import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();

    public void hireTester(Tester tester){
        testersTeam.add(tester);
    }

    public void fireTester(long employeeID){
        testersTeam.removeIf( p -> p.employeeID == employeeID);
    }


}
 */
