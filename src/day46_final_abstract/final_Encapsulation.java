package day46_final_abstract;

public class final_Encapsulation {


    
    final private int data1 = 200;
    private int data2 = 300;

    public int getData1(){ //any information does not require so we left the parentheses without argument
        return data1;       //public cunku zaten private i read yapmak istiyoruz. tekrar private yazilabilir ama yine read olmaz
    }
    /*
    public void setData1(int data1){
        this.data1=data1; //final cannot be reassigned
    }
     */

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }


    /*
    public void setData1(String data1){
       data1=data1; //boyle yaparsak data 1 i String e atadi. ////boyle yaparsak instance variable a assign degil kendine yani local variable a assign yapiyoruz.
        // this.data1=data1; //compile error cunku datatype must be the same
    }
     */



}

