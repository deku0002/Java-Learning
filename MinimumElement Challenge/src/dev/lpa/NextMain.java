package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class NextMain {

    public static void main(String[] args) {
        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));

        System.out.println("The Minimum Element: "+findMin(array));
    }

    private static int[] readIntegers(){
        Scanner scrn = new Scanner(System.in);

        System.out.println("Enter a list of integers, seperated by commas: ");
        String input = scrn.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i=0;i<splits.length;i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    public static int findMin(int[] array){

        int min = array[0];

        for(int el : array){
            if(min>el){
                min = el;
            }
        }

        return min;
    }


}
