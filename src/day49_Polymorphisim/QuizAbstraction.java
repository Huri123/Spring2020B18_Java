package day49_Polymorphisim;

interface A{

    void readBook();  // public abstract
    abstract void watchTV(); // public

}

abstract class B implements A{

    public void readBook(){
        System.out.println("REading Books");
    }

    // public abstract void watchTV();

}


public class QuizAbstraction extends B {

    public void watchTV(){
        System.out.println("Watching TV");
    }

}