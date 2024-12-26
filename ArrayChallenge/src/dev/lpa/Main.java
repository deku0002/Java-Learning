package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = getRandomIntegers(10);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        int[] sortedArray = sortIntegers(array);
        System.out.println(Arrays.toString(sortedArray));

    }
    public static int[] getRandomIntegers(int len){
        int[] newArray = new int[len];

        Random random = new Random();
        for(int i=0;i<len;i++){
            newArray[i] = random.nextInt(100);
        }

        return newArray;
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp = 0;
        while(flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }

        return sortedArray;
    }
}
