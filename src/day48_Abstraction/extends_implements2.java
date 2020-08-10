package day48_Abstraction;

interface P {
    void method1();
}

interface Q extends P { //Busrasi implements olamaz.
    int method2();
}

abstract class R {
    abstract void method3();
}

//extend keyword has to be used first,then can implement the interfaces
public class extends_implements2 extends R implements P, Q { // R classini ve P ve Q interfacelerini inherit ediyor. ama extends, implements den once gelmeli

    //R obj=new R(); //not concrete. bu yuzden object olusturamayiz.
    //Q obj2=new Q();

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }


}
