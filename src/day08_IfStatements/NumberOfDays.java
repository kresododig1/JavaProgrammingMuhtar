package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 12;

        boolean monthWith31day = number == 1  || number ==3 || number ==5 || number ==7 || number ==8 || number ==10
                || number ==12;
        boolean monthWith30day = number == 4 || number == 6 || number == 9 || number == 11;
        boolean monthWith28day = number == 2;

        if(monthWith31day) {

            System.out.println("31 days");
        }
            if(monthWith30day) {

                System.out.println("30 days");
            }

            if(monthWith28day) {
                System.out.println("28 days");
            }
    }
}
