package day32_Constructors;

public class CarObjects {

    public static void main(String[] args) {


        Car car1 = new Car("Toyota");

        Car car2 = new Car(" Honda", "Accord");

        Car car3 = new Car(" Lexus", "RX350", 2020);

        Car car4 = new Car("BMW", "X6", 2020, 50000, "White");

        Car car5 = new Car("Tesla", "Model 3", 2022, 75000, "Black");


        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);
    }

}
