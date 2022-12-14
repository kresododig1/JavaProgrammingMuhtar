package day13_String;

import java.util.Arrays;

public class Vježba {

    public static void main(String[] args) {

     /*  question 15
      String str = "The whole time it was raining.";

       do{
            System.out.print(str.charAt(0));
            str=str.substring(3);
       // System.out.println(str);
        }while (!str.isEmpty());*/

       // question 17 (mislim da je ovo dobar odgovor, ali kad bi se promjenilo u i<str.lenght()
       String str = "cybertek";
        for (int i =0; i <=str.length(); i+=2){
            System.out.print(str.charAt(i));
        }
    }

}