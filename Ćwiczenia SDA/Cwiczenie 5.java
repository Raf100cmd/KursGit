import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciseFive {

    // Exercise five
    //Write a program that takes two integers and then the following operation
    //mathematical:
    //addition
    //subtraction
    //multiplication
    //division
    //raise to a power (the first argument is a number that will be raised to a power,
    //the second argument is the power to which we raise the warrant)

    //The title result should be assigned to the newly created variable, type title.
    //The page selection result on the page should be:
    //addition -> "a = A, b = B, result to C"
    //subtraction -> "a = A, b = B, result to C"
    //multiplication -> "a = A, b = B, result to C"
    //division -> "a = A, b = B, result to C"
    //raising to the power -> "a = A, raised to the power of B, gives the result C"

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę całkowitą");
        double a = userInput.nextInt();

        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę całkowitą");
        double b = userInput1.nextInt();

        double c = a + b;
        double d = a - b;
        double e = a * b;
        double f = a / b;
        double g = Math.pow(a, b);

        if (b == 0){

            System.out.println("Dodawanie");
            System.out.println(" a = " + a + "," + " b = " + b + "," + " wynik to " + c);

            System.out.println("Odejmowanie");
            System.out.println(" a = " + a + "," + " b = " + b + "," + " wynik to " + d);

            System.out.println("Mnożenie");
            System.out.println(" a = " + a + "," + " b = " + b + "," + " wynik to " + e);

            System.out.println("Dzielenie");
            System.out.println("Błąd. Nie dzieli się przez zero");

            System.out.println("Potęgowanie");
            System.out.println(" a = " + a + "," + " podniesione do potęgi " + b + "," + " daje nam " + g);


        } else {

        System.out.println("Dodawanie");
        System.out.println(" a = " + a + "," + " b = " + b + "," + " wynik to " + c);

        System.out.println("Odejmowanie");
        System.out.println(" a = " + a + "," + " b = " + b + "," + " wynik to " + d);

        System.out.println("Mnożenie");
        System.out.println(" a = " + a + "," + " b = " + b + "," + " wynik to " + e);

        System.out.println("Dzielenie");
        System.out.println(" a = " + a + "," + " b = " + b + "," + " wynik to " + f);

        System.out.println("Potęgowanie");
        System.out.println(" a = " + a + "," + " podniesione do potęgi " + b + "," + " daje nam " + g);

    }


    }
}
