package day35_Encapsulation;

public class CydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("mia",
                'F', 36, 44, 10,
                "QA");

        System.out.println(student1);

        student1.attendClass();
        student1.study();


    }
}
