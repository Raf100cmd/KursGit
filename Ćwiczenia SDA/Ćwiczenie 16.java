/* Sklep internetowy oferuje sprzedaż ratalną. Napisz program, który policzy ratę miesięczną za
zakupiony towar. Danymi wejściowymi dla programu są:
cena towaru od 100 zł do 10000 zł
liczba rat od 6 do 48
Oprocentowanie jest zależne od liczby rat:
liczba rat od 6 do 12, oprocentowanie 2,5%
liczba rat od 13 do 24, oprocentowanie 5%
liczba rat od 25-48, oprocentowanie 10%
Użytkownik samodzielnie wybiera liczbę rat oraz kwotę pożyczki */

import java.util.Scanner;

public class ExerciseSixteen {

    public static void main(String[] args) {

        Scanner cena = new Scanner(System.in);
        Scanner liczbaRat = new Scanner(System.in);
        System.out.println("Podaj cenę towaru (od 100 zł do 10 000 zł)");
        System.out.println("Podaj liczbę rat (od 6 do 48)");
        double c = cena.nextDouble();
        int d = liczbaRat.nextInt();

        if(6 <= d && d <= 12  ){

            double kwota  = (c * 0.025) + c;
            double rata = kwota/d;
            System.out.println("Kwota pożyczki wynosi: " + kwota);
            System.out.println("Miesięczna rata wynosi: "+ rata);
        } else if (13 <= d && d <= 24) {
            double kwota1  = (c * 0.05) + c;
            double rata1 = kwota1/d;
            System.out.println("Kwota pożyczki wynosi: " + kwota1);
            System.out.println("Miesięczna rata wynosi: "+ rata1);
        } else if (25 <= d && d <= 48){
            double kwota  = (c * 0.1) + c;
            double rata = kwota/d;
            System.out.println("Kwota pożyczki wynosi: " + kwota);
            System.out.println("Miesięczna rata wynosi: "+ rata);
        }


    }
}