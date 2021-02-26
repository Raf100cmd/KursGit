mport java.util.Scanner;

public class ExerciseFour {

    // Exercise four
    //Write a program that will take an integer from the user and write it to the screen. On the screen
    //you should see "User entered X" where X is a number provided by the user.

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");

        int a = userInput.nextInt();

        System.out.println("Użytkownik w pisał liczbę  " + a);
    }
}