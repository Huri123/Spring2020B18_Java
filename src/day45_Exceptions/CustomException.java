package day45_Exceptions;

//class BreakTimeException{} boyle extend yapmazsak throw new BreakTimeException(); da hata verir
class BreakTimeException  extends RuntimeException{  // custom unchecked exception

        public BreakTimeException(){
                super("It's break time, we should take break");//buraya ne yazarsan console a o yazacak
        }

        public BreakTimeException(String str){
                super(str);
        }

}

public class CustomException {

        public static void main(String[] args) {

                boolean breakTime = true;

                if(breakTime){
                        throw new BreakTimeException();

                }else {
                        System.out.println("Continue the class");
                }

                  // throw new RuntimeException("It's break time, we should take break");


        }

}