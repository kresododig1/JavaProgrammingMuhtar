package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Vjezba {

    public static void main(String[] args) {

        ArrayList<Integer>  numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //6
        numbers.add(60); //7

        numbers.add(2, 25); //2
        numbers.add(5, 45); //5

        System.out.println(numbers);

        System.out.println(numbers.size());

        System.out.println(numbers.get(3));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");

        }

        System.out.println("------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove("Suat");
        System.out.println(employees);

        //employees.clear();
       // System.out.println(employees);
       // System.out.println(employees.size());

        System.out.println(employees.indexOf("Olga"));

        System.out.println(employees.lastIndexOf("Ali"));

        System.out.println(employees.contains("Ali"));
        System.out.println(employees);

        ArrayList<String> employees2 = new ArrayList<>();

        employees2.add("Suat");
        employees2.add("Aygun");
        employees2.add("Olga");
        employees2.add("Neira");
        employees2.add("Ali");
        employees2.add("Hulya");
        employees2.add("Kaloyan");

        employees.set(0,"Suat");
        employees2.remove("Aygun");

        System.out.println("====================================================");

        System.out.println("employees = " + employees);
        System.out.println("employees2 = " + employees2);

        System.out.println("------------------------------------------");

        employees.addAll(employees2);
        System.out.println(employees);

        System.out.println(employees.equals(employees2));

        System.out.println("-----------------------------------------------");

        System.out.println("employees = " + employees);
        System.out.println("employees2 = " + employees2);


       /* employees.removeAll(employees);
        System.out.println(employees);*/

        System.out.println("=============================================");

        ArrayList<Integer> numbers1 = new ArrayList<>();
        //Bulk Operation: CollectionType
        numbers1.addAll( Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers1);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ivan",
                "Damir","Mirko", "Mia"));

        System.out.println("names = " + names);
        names.add(0,"Krešo");
        System.out.println("names = " + names);
        names.add("Zdenka");
        System.out.println( names);

        System.out.println("------------------------------------");
        //Collections.sort(names);
        System.out.println(names);


        System.out.println("Collections.max(names) = " + Collections.max(names));
        System.out.println("Collections.min(names) = " + Collections.min(names));

        Collections.reverse(names);
        System.out.println("names = " + names);

       Collections.swap(names,2,4);
        System.out.println("names swap = " + names);

        System.out.println("Frequency is " +Collections.frequency(names,"Zdenka"));

        Collections.replaceAll(names,"Zdenka", "Dominko");
        System.out.println(names);

        names.add("Kuki");
        System.out.println(names);



    }

}
