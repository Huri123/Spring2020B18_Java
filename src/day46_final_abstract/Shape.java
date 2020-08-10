package day46_final_abstract;

//class ayni zamanda hem final hem de abstract olamaz

//public abstract final class Shape {} //class ayni zamanda hem final hem de abstract olamaz
public abstract class Shape { //abstract methodun calismasi icin classin da abstract olmasi lazim

    abstract void Area();  //public abstract void Area(); bu da olur
                           //body of the method is empty.there is no {}
                           //once we give abstract we do not need to worry about implementation.implement diger extend yapilan class larda oluyor
                            //extend yapilan classlarda bu method override yapilmali
}
