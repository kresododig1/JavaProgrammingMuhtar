package day25_CustomMethods_Overloading;

public class MainMethodOverloading {

    //Main method can be overloading but there is no purpose of it because it executes only first method!
    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(int[] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }


}