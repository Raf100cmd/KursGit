/*Napisz kalkulator, który przyjmuje od użytkownika następujące parametry:
dwie liczby
operator matematyczny (+, -, *, /)
I wyświetla wynik operacji matematycznych na ekranie.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {

        Scanner Liczba = new Scanner(System.in);
        Scanner znak = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        double a = Liczba.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double b = Liczba.nextDouble();

        System.out.println("Wybierz operator matematyczny ( +, -, *, / ):  ");
        char z = znak.next().charAt(0);

        switch (z)
        {

            case '+':

                double wynik = a + b;
                System.out.println(a + " + " + b);
                System.out.println("Wynik dodawania to: " + wynik);
                break;

            case '-':

                double wynik1 = a - b;
                System.out.println(a + " - " + b);
                System.out.println("Wynik odejmowania to: " + wynik1);
                break;


            case '*':

                double wynik3 = a * b;
                System.out.println(a + " * " + b);
                System.out.println("Wynik mnożenia to: " + wynik3);
                break;

            case '/':

                if (b != 0)
                {

                double wynik4 = a / b;
                    System.out.println(a + " / " + b);
                System.out.println("Wynik dzielenia to: " + wynik4);
                break;
                } else
                    {
                    System.out.println("Błąd. Nie dzieli się przez zero");
                    }


        }



    }
}
