/*Zadanie 5.2 Napisz program, który uruchamiany z dwoma parametrami, imie i nazwisko, wyswietli na ekranie
 w kolejnych wierszach te dane wedug schematu:
Nazwisko: Kowalska
Imi: Maria
Nazwisko i imie: KOWALSKA Maria
Inicjaly: MK
Login: KOmar
Wielkosci liter na wydruku powinny byc zgodne z przykladem, niezaleznie od tego,
jakie wielkosci liter wykorzysta uzytkownik, podajac imie i nazwisko.
Wypisz bledy, które powstana podczas uruchomienia aplikacji z niewaciwa liczba
parametrów.*/
public class Osoba {
    /* Zakladam, ze pierwszym argumentem bedzie imie - args[0], a drugim argumentem nazwisko - args[1] */

        public static void main(String args[]){

            String args1 [] = {"maria", "kowalska"};
            for (int i = 0; i < args1.length; i++) {
                System.out.println("Argument #" + (i + 1) + " = " + args1[i]);
            }
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