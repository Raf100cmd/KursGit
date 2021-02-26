import java.util.Scanner;

public class Password {


    // Write a program that gets the password from the user, but writes words to the screen first
    //"Password, please." The retrieved password should be listed on the screen. If the password matches the
    //with the pattern password "secret", then the text "Welcome to secret."
    //place ", otherwise terminate the program.

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Password, please");

       String a = userInput.nextLine();
        System.out.println("entered password is " + a);

       if (a.equals("secret")){

           System.out.println("Welcome to secret, place");
       } else {

           System.out.println("I`m sorry. The Password is fail");
       }

    }
}
