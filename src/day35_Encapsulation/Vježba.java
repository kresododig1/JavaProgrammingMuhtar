package day35_Encapsulation;

public class Vježba {

    private String name;
    private double salary;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Vježba{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
