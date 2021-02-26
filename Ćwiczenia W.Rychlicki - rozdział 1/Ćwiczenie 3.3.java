/* Utwórz lancuch znaków zawierajacy slowo Programista poszukwany. Pilnie !!!.
Napisz program odwracajacy kolejnosc znaków w lancuchu. */

public class LancuchZnakowProgramowanie1 {

    public static void main(String[] args) {

        // zadanie 4.6 program odwracający kolejnosc znakow

        String wyrazenie = "Programista poszukiwany. Pilnie!!!";
        System.out.println(wyrazenie);

        char [] dane = wyrazenie.toCharArray(); // zamiana łancucha znakow na ciag znakow

        for (int i = 0, j = dane.length -1; i < j; i++, j--){
            char odwrotnosc = dane[i];  // wprowadzenie zmiennej pomocniczej - char odwrotnosc
            dane[i] = dane[j];          // sam tylko ten kod powoduje powstanie tzw lustrzanego odbicia - wynik
                                        // "!!!einliP .ynawikkiwany. Pilnie!!!"
            dane[j] = odwrotnosc;
        }
        System.out.println("Odwrócenie znaków w wyrażeniu");
            wyrazenie = new String(dane);
            System.out.println(wyrazenie);
    }
}