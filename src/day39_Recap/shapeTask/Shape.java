package day39_Recap.shapeTask;

public class Shape {

    private String name;//instance variable

    public String getName() {//getter
        return name;
    }

    public void setName(String name) {//setter
        if (name==null){
            System.err.println("Name can not be null!");
            System.exit(1);// 1 means something went wrong!
        }

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {//Constructor
       setName(name);
    }

    public double area(){//method
        return 0;

    }

    public double perimeter(){//method
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

/*

Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */