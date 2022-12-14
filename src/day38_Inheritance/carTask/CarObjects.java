package day38_Inheritance.carTask;

public class CarObjects {

    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("GT", 2022, 50000,"black",14000);

        System.out.println(toyota1);
        toyota1.reliable();

        BMW bmw1 = new BMW("diesel", 2020, 50000, "blue", 10000);
        bmw1.breaksDown();
        bmw1.racing();
        bmw1.start();

    }


}
