package day35_Encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Mia",36,
                'F',"Hrvatski");

        System.out.println(person1);
        person1.drink("water");
        person1.eat("only good food");

        System.out.println(person1);


    }
}
