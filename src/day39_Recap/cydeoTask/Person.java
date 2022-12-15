package day39_Recap.cydeoTask;

public class Person {

    private String name; // instance variables
    private int age; // instance variables
    private char gender; // instance variables


    public String getName() {
        return name;
    } // encapsulated by getter

    public void setName(String name) {
        this.name = name;
    }// encapsulated by setter

    public int getAge() {
        return age;
    }// encapsulated by getter

    public void setAge(int age) {
        this.age = age;
    }// encapsulated by setter

    public char getGender() {
        return gender;
    }// encapsulated by getter

    public void setGender(char gender) {
        this.gender = gender;
    }// encapsulated by setter

    // Constructor
    public Person(String name, int age, char gender) {
       setName(name);
       setAge(age);
       setGender(gender);
    }

    public void eat(){
        System.out.println(name + "is eating");
    }

    public void drink(){
        System.out.println(name + "is drinking");
    }

    public void sleep(){
        System.out.println(name + "is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
1. Create a class named Person:
            Variables:
                name, age, gender
            Encapsulate all the fields
            Add a constructor to set all the fields
            Methods:
                eat()
                drink()
                sleep()
                toString()
 */