import java.util.Scanner;

public class ExerciseSeven {

    // Exercise 7
    //Write a program that takes the name of the user, but writes words to the screen first
    //"Give your name". The name should be printed on the screen. If the given name matches
    //"John Wick", the program should read "I see you're working John again" on the screen, w
    //otherwise, the program should print to the screen "Hello, [xyz]", where [xyz],
    //should be replaced with the value specified by the user.

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Give your name");

        String a = userInput.nextLine();

        if (a.equals("John Wick")){

            System.out.println("I see you`re working John again");
        } else {

            System.out.println("Hello " + a);
        }

    }
}