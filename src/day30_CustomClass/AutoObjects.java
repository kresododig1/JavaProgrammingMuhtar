package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoObjects {

    public static void main(String[] args) {

        Auto auto1=new Auto();
        auto1.setInfo("Opel", "Astra", "Black", 2017, 10000);

        System.out.println(auto1);

        Auto auto2 = new Auto();
        auto2.setInfo("BMW", "335is", "Black", 2020, 45000);

        System.out.println(auto2);


        Auto auto3 = new Auto();
        auto3.setInfo("Audi", "Q7", "Red", 2019, 40000);

        System.out.println(auto3);

        Auto [] auto = {auto1,auto2,auto3};
        System.out.println(Arrays.toString(auto));
        System.out.println("------------------------------------------");

        ArrayList<Auto> autoLista = new ArrayList<>();
        autoLista.addAll(Arrays.asList(auto1,auto2,auto3));
        System.out.println(autoLista);

        System.out.println("-------------------------------------------");

        for (Auto each: autoLista) {
            System.out.println(each.brand + " : " + each.price);

        }
        System.out.println("-------------------------------------");

         /*
         Recall:
            BMW: 2005 ~ 2008
            Audi: 2018~ 2020
         */

        autoLista.removeIf(p-> p.brand.equals("BMW") && p.year >=2005 && p.year <=2020);
        autoLista.removeIf(p-> p.brand.equals("Audi") && p.year >=2018 && p.year <=2020);

        System.out.println(autoLista);
        }


    }



