package day32_Constructors;

public class Employee {

    public String name; // instance variables!
    public char gender; // instance variables!
    public String jobTitle; // instance variables!
    public double salary; // instance variables!


    public Employee(String name){
        this.name = name;
    } //1st constructor

    public Employee(String name, char gender){ //2nd constructor
        this(name); //this.name = name (do not use like this!) - this(name) -> is calling  1st constructor!
        this.gender = gender;

    }

    public Employee(String name, char gender, String jobTitle){ //3rd constructor
        this(name, gender); // -> is calling  2nd constructor!
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){ //4th constructor
        this(name, gender, jobTitle); // -> is calling  3rd constructor!
        this.salary = salary;
    }


    /*
    public void method1(){
        this("Aaron");
    }
*/

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }


    /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */

}