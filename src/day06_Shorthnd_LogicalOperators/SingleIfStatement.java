package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {

            boolean coldWeather = false;
        if (coldWeather){
            // true
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }
        boolean coronaDetected = true;
        if (coronaDetected){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more Java coding");
        }
        System.out.println("===================================");
        int a = 201;
        boolean evenNumber = a % 2 == 0; //if a number can be divided by 2 without remainder
        //boolean oddNumber = a % 2 != 0; //if the number cannot be divided by 2 evenly

        if (evenNumber){
            System.out.println(a+" is an even number");
        }
        if (!evenNumber){ //* if the number is not even number, it must be odd
            System.out.println(a+" is odd number");
        }

    }
}
