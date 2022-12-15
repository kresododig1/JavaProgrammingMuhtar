package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square=new Square(10);

        System.out.println(square);

        //square.side = 40; can NOT reach it because it's private variable in parent class!
        square.setSide(15);

        System.out.println(square);

        System.out.println("-----------------------------------------");


        Rectangle rectangle = new Rectangle(5,6);

        System.out.println(rectangle);

        rectangle.setLength(10);//changing the value of length

        System.out.println(rectangle.getLength());//check the new length

        System.out.println(rectangle);

        System.out.println(rectangle.getName());//check the name

        System.out.println("----------------------------------------");

        Circle circle=new Circle(7.5);

        System.out.println(circle);

        circle.setRadius(15.5);

        System.out.println(circle.getRadius());//check the new length

        System.out.println(circle);

        System.out.println(circle.getName());//check the name

    }
}
