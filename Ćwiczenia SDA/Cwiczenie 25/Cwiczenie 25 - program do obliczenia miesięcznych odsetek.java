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

public class KontoROR {

        double rocznaStopaOprocentowania;
        double aktualnyStanKonta;

        KontoROR(double rocznaStopaOprocentowania, double aktualnyStanKonta) {
            this.aktualnyStanKonta = aktualnyStanKonta;
            this.rocznaStopaOprocentowania = rocznaStopaOprocentowania;
        }

        void ObliczeniaMiesięcznychOdstetek() {
               System.out.println((rocznaStopaOprocentowania * aktualnyStanKonta) / 12);
        }

        void NowyStanKonta() {
                System.out.println(aktualnyStanKonta + ((rocznaStopaOprocentowania * aktualnyStanKonta) / 12));
        }
 }


