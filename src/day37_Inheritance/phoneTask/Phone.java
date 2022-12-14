package day37_Inheritance.phoneTask;

public class Phone {// parent class: only contains the common features of all the subclass

    //instance variables
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    //static variable
    public static boolean hasBattery;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    //static block is used to set static variable in more steps (but can be in one step)
    // public static boolean hasBattery = true ( example of setting it in one step)
    static {
        hasBattery = true;
    }

    // instance method
    public void call(long phoneNumber) {
        System.out.println(brand + " is calling");
    }
    // instance method
    public void text(long phoneNumber) {
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }

    // instance method
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }
}
/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */