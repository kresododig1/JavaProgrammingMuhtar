package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

      // System.out.println(AccessModifiers_Test4.name1); //default access modifier can't been seen in outside package
        System.out.println(AccessModifiers_Test4.name2);


       // AccessModifiers_Test4.method1(); //default access modifier can't been seen in outside package
        AccessModifiers_Test4.method2();


    }
}
