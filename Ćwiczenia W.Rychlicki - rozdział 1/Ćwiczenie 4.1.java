/* Zadanie 5.2a - napisz program odwolujacy sie do programu w zadaniu 5.2,
* w ktorym to na podstawie wpisanych danych osobowych przez uzytkownika,
* zostana wypisane przez konsole dane osobowe wraz z loginem i inicjalami
* jak w zadaniu 5.2. Schemat:
* Nazwisko:
  Imie:
   Nazwisko i imie:
   Inicjaly:
   Login: "Dwie pierwsze litery nazwiska duze i trzy pierwsze litery imienia malymi literami" */

import java.util.Scanner;

public class OsobaScaner {
    /* Zakladam, ze pierwszym argumentem bedzie imie - args[0], a drugim argumentem nazwisko - args[1] */
    public static void main(String[] args) {
        // W pierwszej kolejnosci inicjuje funkcje scanner, w celu mozliwosci wypisania przez
        // uzytkownika swoich danych personalnych
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj imie");
        String a = userInput.next();
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Podaj nazwisko");
        String b = userInput1.next();

        // Nastepnie tworze tabele argumentow aplikacji, w ktorych umieszcze dwa argumenty: imie i nazwisko
        String args1[] = {a, b};
        
        // W nastepnej kolejnosci wykonuje wszystko wg schematu
        System.out.print("Nazwisko: ");
        System.out.println(args1[1].substring(0, 1).toUpperCase()+args1[1].substring(1).toLowerCase());
        System.out.print("Imie: ");
        System.out.println(args1[0].substring(0,1).toUpperCase() + args1[0].substring(1).toLowerCase());
        System.out.println("Nazwisko i imie: " +args1[1].toUpperCase()+ " "+ args1[0].substring(0,1).toUpperCase()
                + args1[0].substring(1).toLowerCase());
        System.out.println("Inicjaly: "+ args1[0].substring(0,1).toUpperCase()+args1[1].substring(0,1).toUpperCase());
        System.out.println("Login: "+ args1[1].substring(0,2).toUpperCase()+args1[0].substring(0,3).toLowerCase());
    }
}