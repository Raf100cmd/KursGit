/* Utwórz tablicę o nazwie "Informatyka" Napisz program wyswietlający znaki zawarte na tablicy
* w następujący sposób:
* - a) pionowo - każdy znak w odrębnym wierszu;
* - b) poziomo - znaki oddzielone dodatkowymi odstępami;
* - c) poziomo - wielkimi literami;
* - d) poziomo - małymi literami; */

public class TablicaInformatyka {

    public static void main(String[] args) {

        char napisInformatyka [] = { 'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'y', 'k', 'a'};
        // podpunkt a - 1. rozwiązanie
        System.out.println("a)  1 rozwiązanie  - pionowo");
        System.out.println(napisInformatyka[0]);
        System.out.println(napisInformatyka[1]);
        System.out.println(napisInformatyka[2]);
        System.out.println(napisInformatyka[3]);
        System.out.println(napisInformatyka[4]);
        System.out.println(napisInformatyka[5]);
        System.out.println(napisInformatyka[6]);
        System.out.println(napisInformatyka[7]);
        System.out.println(napisInformatyka[8]);
        System.out.println(napisInformatyka[9]);
        System.out.println(napisInformatyka[10]);
        System.out.println(" ");

        // podpunkt a - 2. rozwiązanie (zastosowanie pętli)
        System.out.println("a) 2 rozwiązanie - pionowo");
        for (char x : napisInformatyka){
            System.out.println(x);
        }

        // podpunkt b
        System.out.println("b) poziomo - roztrzelany tekst ");
        for (char x : napisInformatyka){
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println(" ");

        // podpunkt c
        System.out.println("c) poziomo - wszystkie wielkie litery");
        for (char x : napisInformatyka){
            System.out.print(Character.toUpperCase(x));
            System.out.print(" ");
        }
        System.out.println(" ");

        // podpunkt d
        System.out.println("c) poziomo - wszystkie małe litery");
        for (char x : napisInformatyka){
            System.out.print(Character.toLowerCase(x));
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}