package day40_Encapsulation;

public class Credentials {

    private String Username;//Those private variables will not be able to directly,they will be able to be accessed through getter and setter method
    private String Password;

    public String getUsername(){
        return Username;
    }

    public void setUsername(String Username){
        this.Username=Username;//It will assign user given argument
    }

    public String getPassword(){
        return Password;
    }

    public void setPassword(String Password){
        this.Password=Password;
    }




}
