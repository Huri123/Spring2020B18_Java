package day37_Constructors;

import java.util.ArrayList;

public class BankOfAzerBaijan {
    public static void main(String[] args) {
        ArrayList<Employee>list=new ArrayList<>();
        list.add(HumanResources.employee3); //we called it through the classname
        list.add(HumanResources.employee5);

        System.out.println(list.get(0));//null veriyor. cunku employee leri human resources ta main de initialize yaptik.
        //o yuzden static variableslari static block ta initialize yapacagiz.
        //static te initialize yapinca burda calisti.human resources tekiler calismadi

        System.out.println(list.get(1));
    }
}
