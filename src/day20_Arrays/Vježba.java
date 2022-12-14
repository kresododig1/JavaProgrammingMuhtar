package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

import day25_CustomMethods_Overloading.AddElementsToArray;
import day25_CustomMethods_Overloading.AddElementsToArray.*;

public class Vježba {

    public static void main(String[] args) {

       int[] scores = new int[5];

       scores[0]=4;
       scores[1]=5;
        scores[2]=4;
        scores[3]=5;
        scores[4]=7;

        System.out.println(Arrays.toString(scores));

        System.out.println("-------------------------------------------");

        int[] arr = {1,2,3,4};

        arr= AddElementsToArray.addInteger(arr,5);
        System.out.println(Arrays.toString(arr));





    }

}
