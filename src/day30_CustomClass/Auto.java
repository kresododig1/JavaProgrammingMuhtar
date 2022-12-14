package day30_CustomClass;

public class Auto {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;



    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price + " KN"+
                '}';
    }

    public void setInfo (String autoBrand, String autoModel,
                         String autoColor, int autoYear,
                         double autoPrice){
        brand=autoBrand;
        model=autoModel;
        color=autoColor;
        year=autoYear;
        price=autoPrice;
    }

    public void drive(){
        System.out.println("Driving "+ brand+ " "+ model);
    }
    public void start(){
        System.out.println(brand+" "+model+" has started");
    }

    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }


}
