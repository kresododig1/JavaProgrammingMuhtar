package day27_WrapperClasses;

import java.util.Arrays;

public class Vježba {

    public static void main(String[] args) {

        String str = "123";

        int number = Integer.parseInt(str)+4;
        System.out.println(number);

        String str2 = "10.5";

        double str3= Double.parseDouble(str2);
        System.out.println(str3 + 5);

        String name = "567";

       long name2= Long.parseLong(name);
        System.out.println(name2 + 1);

        System.out.println("--------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2);// Integer

        System.out.println(x+2);
        System.out.println(y+5);





    }

}
