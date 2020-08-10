package day46_final_abstract;
/*
final class Data{
}
public class final_class extends Data{//final class(Data) cannot be inherited
}
 */
class Data{
}
public final class final_class extends Data{//final class(Data) cannot be inherited
    /*
    final { //error cunku final i variable,method ya da class a kullanabiliriz.block ta kullanilmaz

    }
    final static {//error cunku final i variable,method ya da class a kullanabiliriz.block ta kullanilmaz

    }
     */
    {

    }
    static{

    }
}

//class Data2 extends final_class{}//final class can never be SUPER class. o yuzden extend yaptigi class tan final keyword u remove yapmaliyiz

/*
Muhtar'in kodlari:
class Data{

}

public final class final_class extends Data{

    {

    }

    static{

    }


}


// class Data2 extends final_class{ }    // final class can NEVER be super class
 */
