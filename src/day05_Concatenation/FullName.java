package day05_Concatenation;

import java.sql.SQLOutput;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Jimmy";
        String lastName = "King";
        int age = 42;
        String fullName = firstName + " " + lastName;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        // Full name of the person is _________
        System.out.println("Full name of the person is " + fullName);
        //____is___years old
        System.out.println(fullName + " is " + age + " years old.");
        //FullName is JobTitle, works at CompanyName, and FullName's salary is Salary
        System.out.println(fullName + " is "+ jobTitle + ", works at "+ companyName +", and "
                + fullName + "'s salary is $" + salary);


    }
}
/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
 */