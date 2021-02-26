/* Utwórz lancuch znakow zawierajacy slowo programowanie.
Napisz program zmieniajacy zawartosc lancucha i wywietlajacy efekty tych zmian:
a) zamien pierwsza litere na wielka,
b) zamien wszystkie litery na wielkie. */

public class LańcuchZnakowProgramowanie2 {

    public static void main(String[] args) {

        String lancuch = "progamowanie";
        System.out.println(lancuch);
        System.out.println("zamień pierwszą literę na wielką");
        Character.toUpperCase(lancuch.charAt(0)); // korzystamy z klasy Charakter i zamieniamy znak będący pod
                                                  // indeksem 0 na wielką literę
        lancuch = Character.toUpperCase(lancuch.charAt(0)) + lancuch.substring(1);
                                                  // łączymy łańcuch "P" z łańcuchem "rogramowanie" i tworzymy
                                                  // łańcuch "Programowanie"
        System.out.println(lancuch);

        System.out.println("zamień wszystkie litery na wielkie");
        System.out.println(lancuch.toUpperCase());
    }
}