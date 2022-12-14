package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Krešimir",
        buildingNumber = "3",
        streetName = "VKS",
        city = "Osijek",
        state = "Croatia",
        zipCode = "31000";

        //System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + zipCode + " " + " " + state);
        String addres = name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + zipCode + " " + " " + state;
        System.out.println(addres);


    }


}
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
 */