package day46_final_abstract;

public class final_method {
    public final void method(){

    }
    public final int method(int a){  //we can overload final methods.in overload,return type(here int) no matters.
return 100;
    }

    public final static void main(String[] args) { //we can also use final at static methods

    }
    /*
    public final final_method(){ //we cannot apply final for constructors

    }
    public static final_method(){ //we cannot static final for constructors

    }
     */
    public final_method(){} //constructor.final kullanamayiz
}
