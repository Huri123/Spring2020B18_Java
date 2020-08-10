package day37_Constructors;

//import java.util.Arrays;//only imports Arrays class from java util
import java.util.*;//java util deki tum classlari import eder. imports all classes fom java util
/*
import static day37_Constructors.Data.staticVariable;
import static day37_Constructors.Data.staticMethod;
 */
import static day37_Constructors.Data.*;

public class ImportStatement {
    public static void main(String[] args) {

        int[] arr = {4, 2, 3, 1};
        Arrays.sort(arr);

        System.out.println(staticVariable);
        staticMethod();
    }
}
