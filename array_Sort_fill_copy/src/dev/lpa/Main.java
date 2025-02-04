package dev.lpa;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[]args){

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largeArray));

        String[] s = {"Alexa","Jane","Mark","Ralph","David"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        if(Arrays.binarySearch(s,"Mark")>=0){
            System.out.println("Found Mark in the list "+Arrays.binarySearch(s,"Mark"));
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if (Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        } else{
            System.out.println("Arrays are not equal");
        }
    }
    private static int[] getRandomArray(int len){
 
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i=0;i<len;i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
