/* Napisz program, który wywietli na ekranie etykietkę zawierającą:
 imię i nazwisko podane jako parametry wywolania aplikacji */

import java.util.Scanner;

public class ArgumentyEtykieta {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = userInput.next();
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Podaj nazwisko");
        String nazwisko = userInput1.next();

        // wyświetlanie etykiety
        System.out.println("WYŚWIETLANIE ETYKIETY");
        String args1 [] = {imie, nazwisko};

        int znaki;
        for (znaki = 0; znaki < imie.length()+ nazwisko.length()+ 5; znaki ++){
            System.out.print("*");
            // do długości znaków imie i nazwisko dodaje wartość pięć z uwagi na krawędź początkowa
            // i końcową etykiety oraz odstępy pomiędzy imieniem i nazwiskiem oraz
            // odstępami pomiedzy argumentami a tzw. krawędzią etykiety
        }
        System.out.println();
        System.out.println("*" +" " + args1[0] + " " + args1[1] + " " + "*");
        for (znaki = 0; znaki < imie.length()+ nazwisko.length()+ 5; znaki ++){
            System.out.print("*");
        }
    }
}