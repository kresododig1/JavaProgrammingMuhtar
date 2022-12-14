package day35_Encapsulation;

public class Person {

    // instance variables
    public String name;
    public int age;
    public char gender;
    public String language;

    // static variables
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    //Constructor -> is only using  instance variables!
    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }
    //Static block - uses only static variables! First gets executed (before main method)
    static {

        planet="Earth";
        isHuman= true;
        hasNose= true;
        numberOfHead=1;
        numberOfWings=0;

    }

       //static method -> can NOT use instance variables, only static variables!
    public static void printPlanetName(){
        System.out.println("Planet name is "+ planet);
    }

        //  instance method -> can use both instance and static variables!
    public void eat (String food){
        System.out.println(name + " is eating " + food);
    }

    //  instance method -> can use both instance and static variables!
    public void drink (String drink){
        System.out.println(name + " is drinking " + drink);

    }

    //toString is instance method and can use both, instance and static variables
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet= '" + planet+ '\''+
                ", isHuman= " + isHuman+
                '}';
    }
}
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */