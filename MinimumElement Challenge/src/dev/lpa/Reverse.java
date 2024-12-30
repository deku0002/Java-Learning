package dev.lpa;

import java.util.Scanner;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = readIntegers(3);
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

    public static int[] reverseArray(int[] array,int len){
        int[] newArray = new int[len];int j=0;
        for (int i=len-1;i>=0;i--){
            newArray[j++] = array[i];
        }
        return newArray;
    }
}
