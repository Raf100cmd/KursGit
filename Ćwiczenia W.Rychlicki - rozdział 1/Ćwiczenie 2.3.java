/*Utwórz tablicę znaków  słowa 'programowanie'.
Napisz program wyświetlający znkai w tablicy w kolejności
odwrotnej - od końca do początku.
* */

public class TabliceWspak {

    public static void main(String[] args) {

        char wyraz[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};
        System.out.println(wyraz);

        // wyświetlanie tablicy wspak
        System.out.println();
        System.out.println("Wyświetlanie tablicy wspak");

        for (int  i = wyraz.length - 1; i>=0; --i) {
            System.out.print(wyraz[i] + " ");
        }
    }
}