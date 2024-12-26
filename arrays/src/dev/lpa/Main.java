package dev.lpa;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myDoubleArray[2]);

        int[] ar;
        ar = new int[]{1, 2, 3, 4, 5};

        for(int element : ar){
            System.out.print(element+" ");
        }
        System.out.println();

        String a  = Arrays.toString(ar);
        System.out.println(a);

        Object objectVariable = ar;
        if (objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[3] = ar;
    }
}
