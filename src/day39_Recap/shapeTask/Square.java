package day39_Recap.shapeTask;

public class Square extends Shape {

    /*in child class first declare additional fields (instance variable)
    and methods that CAN NOT be inherited from parent class, then make Constructor!*/
private double side;//instance variable

    public double getSide() {//return method
        return side;
    }

    public void setSide(double side) {//void method
        if (side<=0){
            System.err.println("Invalid side: " + side);
            System.exit(1);
        }

        this.side = side;
    }

    public Square(double side) {//constructor
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
