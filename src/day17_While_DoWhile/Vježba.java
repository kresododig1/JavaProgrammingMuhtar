package day17_While_DoWhile;

import java.util.Scanner;

public class Vježba {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        byte b1 = userInput.nextByte();
        byte b2 = userInput.nextByte();

        int max = (b1 > b2) ? b1 + 2 : b2 - 4;

        System.out.println(max);






       /* System.out.println("Enter your user name");
        String u= scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("You are logged in");
        }else{
            int attemps = 3;

            while( !(u.equals("Cydeo") && p.equals("Cydeo123")) && attemps > 0){
                if(attemps==1){
                    System.err.println("THIS IS YOUR LAST CHANCE");
                }
                System.out.println("Incorect user name or password, please re-enter");

                System.out.println("Enter your user name");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();
                attemps--;

            }
            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("You are logged in");

            }else{
                System.out.println("Your account is locked.");
            }

        }*/

       /* scan.close();
        /*Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if( u.equals("Cydeo")  && p.equals("Cydeo123") ){ // if credentials are valid

            System.out.println("Logged in");

        }else{ // if credentials are not valid
            int attempts = 3; //3, 2, 1

            while( !(u.equals("Cydeo")  && p.equals("Cydeo123")) &&  attempts > 0 ){ // while the credentials are invalid, and user has attempts to reenter

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempts--;
            }

            if(u.equals("Cydeo")  && p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked.");
            }

        }

        scan.close();*/





    }


}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */