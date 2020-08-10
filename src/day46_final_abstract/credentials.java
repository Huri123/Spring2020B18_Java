package day46_final_abstract;

public class credentials {

    final private String username = "Cybertek";
    final private String password = "Cybertek12345";

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /*
    public void setUsername(String username){
        username=username;  //boyle yaparsak instance variable a assign degil kendine yani local variable a assign yapiyoruz.
        //this.username=username; //error cunku final reassign yapilamaz
    }
     */
}
