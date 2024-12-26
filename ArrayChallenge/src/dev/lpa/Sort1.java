package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Sort1 {
    public static void main(String[] args) {

        int[] array = getRandomIntegers(10);
        Arrays.sort(array);
        StringBuilder s = new StringBuilder(Arrays.toString(array));
        s.reverse();
        String r =s.toString().replaceAll("[\\[\\]]","");
        System.out.println(r);
    }
    public static int[] getRandomIntegers(int len){
        int[] newArray = new int[len];

        Random random = new Random();
        for(int i=0;i<len;i++){
            newArray[i] = random.nextInt(100);
        }

        return newArray;
    }
}
