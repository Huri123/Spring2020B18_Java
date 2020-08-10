package day40_Encapsulation;

public class Person {

    public  String name;

    private long SSN;
    private int ID;

    public Person(String name){ //constructor
        this.name=name;
    }
    public long getSSN(){
        return SSN;
    }
    // we need to generate setter:
// preferred name is setVariableName()
// better to be public access modifier to be used everywhere
// return type is void because we are not returning anything
// we must pass an argument (parameter)
// argument dataType MUST match private instance variable dataType: long here
    public void setSSN(long SSN){
        this.SSN=SSN;
    }

    public long getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public void setSSNAndId(long SSN,int ID){//ikisini ayni anda yapmamiz lazim. o yuzden cok kullanisli degil
        //this.SSN=SSN;
        //this.ID=ID;
        setSSN(SSN);
        setID(ID);
    }


}
