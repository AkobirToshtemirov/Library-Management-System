package TrainingEpam;

import java.util.Arrays;
import java.util.function.Function;

public class FirstClassFunctions {

    protected static class MyMath {
        public static Integer triple(Integer x) {
            return x * 3;
        }
    }

    public static void main(String[] args) {

        Function<Integer, Integer> myTriple = MyMath::triple;
                // arg    // return type of function(methos)
        Integer res = myTriple.apply(5);
        System.out.println(res);

        Function[] functions = {myTriple, myTriple, myTriple};

        System.out.println(Arrays.toString(functions));

    }

    public static void myFunction() {
    }
}
