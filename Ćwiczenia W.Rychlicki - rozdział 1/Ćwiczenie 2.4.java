/* Utwórz tablicę zawierającą znaki
* słowa - programowanie. Napisz program odrwacający kolejność znaków */

public class OdwracanieKolejnosciZnakow {

    public static void main(String[] args) {

        char wyraz[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};

        System.out.println("Normalna kolejność znaków");
        System.out.println(wyraz);    

        for (int  i = 0, j = wyraz.length - 1; i < j; ++i, --j) {
           char odwrotnosc = wyraz[i];
           wyraz[i] = wyraz[j];
           wyraz[j] = odwrotnosc;
        }

        System.out.println("Odwrotna kolejność znaków");
        System.out.println(wyraz);
    }
}