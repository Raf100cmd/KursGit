/* Stwórz klasę "SavingsAccount". Uzyj zmiennej statycznej do przechowywania rocznej stopy
oprocentowania dla posiadaczy konta. Każdy obiekt klasy powinien posiadać instancje zmiennej
przechowującej, aktualny stan oszczędności danego użytkownika.
Stwórz metodę do obliczenia miesięcznych odsetek, oszczędności stanowią iloczyn
oszczędności oraz rocznej stopy oprocentowania podzielone przez ilość miesięcy (12).
Obliczone odsetki należy dodać do aktualnego stanu oszczędności
Stwórz metodę, która umożliwia zmiane rocznej stopy oprocentowania.
Napisz kod, który zademonstruje działanie zaprojektowanej klasy oraz jej metod. Stwórz dwie
instancje klasy, w których będą przechowywane oszczędności, z zainicjalizowanymi wartościami
1000 zł oraz 2000 zł. Ustaw roczne oprocentowanie na poziomie 4%. Policz odsetki, a wynik
wydrukuj na ekran. Następnie zmień oprocentowanie do poziomu 5% i ponownie oblicz odsetki,
wynik wydrukuj na ekran.
 */

public class KontoRORDemo {

    public static void main(String[] args) {

        KontoROR Klient1 = new KontoROR(0.04, 1000);
        KontoROR Klient2 = new KontoROR(0.04, 2000);
        KontoROR Klient3 = new KontoROR(0.05, 1000);
        KontoROR Klient4 = new KontoROR(0.05, 2000);

        System.out.print("Stan Konta ROR dla Oszczędzającego 1, stopa oprocentowania 4%: ");
        Klient1.NowyStanKonta();
        System.out.print("Kwota odstetek po miesiącu: ");
        Klient1.ObliczeniaMiesięcznychOdstetek();

        System.out.print("Stan Konta ROR dla Oszczędzającego 2, stopa oprocentowania 4%: ");
        Klient2.NowyStanKonta();
        System.out.print("Kwota odstetek po miesiącu: ");
        Klient2.ObliczeniaMiesięcznychOdstetek();

        System.out.print("Stan Konta ROR dla Oszczędzającego 1, stopa oprocentowania 5%: ");
        Klient3.NowyStanKonta();
        System.out.print("Kwota odstetek po miesiącu: ");
        Klient3.ObliczeniaMiesięcznychOdstetek();

        System.out.print("Stan Konta ROR dla Oszczędzającego 2, stopa oprocentowania 5%: ");
        Klient4.NowyStanKonta();
        System.out.print("Kwota odstetek po miesiącu: ");
        Klient4.ObliczeniaMiesięcznychOdstetek();
    }
}
