package day30_CustomClass;

public class Cat {

    public String name;
    public String bread;
    public int age;
    public char gender;
    public String size;
    public String color;


    public void setInfo (String catName, String catBread, int catAge,
                         char catGender, String catSize, String catColor){

        name= catName;
        bread=catBread;
        age=catAge;
        gender=catGender;
        size=catSize;
        color=catColor;


    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void cuddling (){
        System.out.println(name + " is cuddling");
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
