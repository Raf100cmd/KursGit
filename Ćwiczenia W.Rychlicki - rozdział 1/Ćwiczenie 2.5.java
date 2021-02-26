/* Przeanalizuj kod podany na listingu 2. Przepisz kod i uruchom tą aplikację. Sprawdź,
czy wyniki na ekranie są zgodne z Twoimi oczekiwaniami. Na podstawie tego kodu
i dokumentacji klasy Character napisz własną aplikację pokazującą działanie wybranej metody
 lub wartości zdefiniowanych stałych.
*  */

import static java.lang.System.*;
public class DemoCharacter {

    public static void main(String args[]) {
        /* Informacje o metodzie */
        out.println("Klasa: java.lang.Character");
        out.println("Metoda statyczna: digit\n");
        out.println("static int digit(int ch, int radix)");
        out.println("Returns the numeric value of the character ch in the specified radix.") ;
        //metoda zwraca liczbę będącą wartością cyfry reprezentowanej przez znak char
             out.println();
        /* Przykadowa tablica znaków */
        char znak[] = {'E', 'u', 'r', 'o', ' ', '2', '0', '1', '2'};
        /* Demonstracja dziaania metody */
        out.println("Wartosc znaku jako cyfry w ukladzie dziesiatkowym (radix = 10)");
        for(char z : znak)
            out.println("Znak: "+z+" Cyfra: "+Character.digit(z, 10));
        out.println("Uwaga: -1 oznacza, ze znak nie jest cyfra w tym ukladzie liczbowym.");
            out.println();
        out.println("Wartosc znaku jako cyfry w ukladzie szesnastkowym (radix = 16)");
        for(char z : znak)
            out.println("Znak: "+z+" Cyfra: "+Character.digit(z, 16));
        out.println("Uwaga: -1 oznacza, ze znak nie jest cyfra w tym ukladzie liczbowym.");
            out.println();
        out.println("Wartosc znaku jako cyfry w ukladzie ósemkowym (radix = 8)");
        for(char z : znak)
            out.println("Znak: "+z+" Cyfra: "+Character.digit(z, 8));
        out.println("Uwaga: -1 oznacza, ze znak nie jest cyfra w tym ukladzie liczbowym.");
            out.println();

         // Cwiczenie 3.6 - wlasna aplikacja ukazujaca dzialanie metody na przykladzie slowa TESTER OPROGRAMOWANIA

        out.println("3.6 Własne ćwiczenie -  TESTER OPROGRAMOWANIA");
        char tabela [] = {'T', 'E', 'S', 'T', 'E', 'R', ' ', 'O', 'P', 'R', 'O', 'G', 'R', 'A', 'M', 'O', 'W', 'A', 'N', 'I', 'A'};
        out.println("Wartosc znaku jako cyfry w ukladzie szesnastkowym (radix = 16)");
        for (char a : tabela)
            out.println("Znak: "+a+" Cyfra: "+Character.digit(a, 16));
        out.println("Uwaga: -1 oznacza, ze znak nie jest cyfra w tym ukladzie liczbowym.");
    }
}