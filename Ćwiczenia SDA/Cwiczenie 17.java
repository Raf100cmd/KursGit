/* Poprawione zadanie 17*/

import java.util.Scanner;
public class ExerciseSeventeen {
    public static void main(String[] args) {

        Scanner readNumber = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = readNumber.nextInt();
        String fizzBuzzResult = fizzBuzz( number);
        System.out.println();
    }

    public static String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("fizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        return String.valueOf(number);
    }

}