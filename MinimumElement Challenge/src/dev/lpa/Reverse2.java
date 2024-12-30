package dev.lpa;

import java.util.Scanner;
import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        int[] array = readIntegers(5);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray(array,array.length)));
    }

    public static int[] readIntegers(int len){
        int[] readArray = new int[len];
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter the Elements: ");
        for(int i=0;i<len;i++){
            readArray[i] = scrn.nextInt();
        }
        return readArray;
    }

    public static int[] reverseArray(int[] revArray,int len){
        int maxIndex = revArray.length-1;
        int halfLength = revArray.length/2;

        for(int i=0;i<halfLength;i++){
            int temp = revArray[i];
            revArray[i] = revArray[maxIndex-i];
            revArray[maxIndex-i] = temp;
        }

        return revArray;
    }
}
