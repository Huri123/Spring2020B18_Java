package day27_Data_Time;

public class Quiz {
    public static void main(String[] args) {
        int x=7;
        if (available(x)){
            System.out.println("b");
        }else{
            System.out.println("a");
        }
    }
    public  static boolean available(int x){
        return x>1?true:false;
    }
}
