package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = readIntegers(5);
        System.out.println(Arrays.toString(array));

        System.out.println("The Minimum Element: "+findMin(array));
    }

    private static int[] readIntegers(int len){
        int[] inputArray = new int[len];
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter the Integers: ");
        for(int i=0;i<len;i++){
            inputArray[i] = scrn.nextInt();
        }
        return inputArray;
    }

    public static int findMin(int[] array){

        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }


}
