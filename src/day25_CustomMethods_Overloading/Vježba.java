package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class Vježba {

    public static void main(String[] args) {


        int num=5;
        while(isAvailable(num)){
            System.out.print(num);
            num--;
        }



        }
    public static boolean isAvailable(int num){
        return (num-- > 0)? true:false;
    }

    }

