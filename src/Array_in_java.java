import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_in_java {
    static int[] intArr=new int[10];
    public static void main(String[] args) {
        //when we are only declaring the array not initializing array it will take  default values
          System.out.println("Before Initialization of array: "+Arrays.toString(intArr));

          initilizationOfArray();

        // after initialization of array we got the value
         System.out.println("After Initialization of array: "+Arrays.toString(intArr));

    }

    private static void initilizationOfArray() {

        for (int i = 0; i < intArr.length; i++) {
            intArr[i]=i*i;
        }
    }

}
