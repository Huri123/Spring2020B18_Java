package day40_Encapsulation;

public class Encapsulation {
    private long SSN;//to hide this within this class only put private

//getter //is for reading only //main purpose of this method to make it accessible everywhere so we should it public should not make it private and default access modifier
   //default is only accessible in the same package //resources package de test yaptik
    public long getSSN(){ //Bu instance method
        return SSN;
    }

//setter:write only.goal is to be able to initialize any given SSN
    //We do not need to return anything
    public void setSSN(long SSN){//in paranthesis parameter is user's parameter
        this.SSN=SSN;
    }



}
