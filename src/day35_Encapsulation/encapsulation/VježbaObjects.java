package day35_Encapsulation.encapsulation;

import day35_Encapsulation.Vježba;

public class VježbaObjects {

    public static void main(String[] args) {

        Vježba employee = new Vježba();

        employee.setName("Josh");
        employee.setSalary(120000);


        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
