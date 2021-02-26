* Utwórz tablicę zawierającą słowo - programowanie.
* Napisz program zmieniający zawartość tablicy:
* a) zamień pierwszą literę na wielką;
* b) zamień wszystkie litery na wielkie */

public class TablicaProgramowanie {

    public static void main(String[] args) {

        char wyraz [] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e' };
        System.out.println(wyraz);

        // a) zamien pierwszą literę na wielką
        System.out.println("a) zamien pierwszą literę na wielką");
        wyraz[0] = Character.toUpperCase(wyraz[0]);
        System.out.println(wyraz);

        // b) zamień wszystkie litery na wielkie
        System.out.println("b) zamień wszystkie litery na wielkie");
        for (char c :wyraz){
            System.out.print(Character.toUpperCase(c) + " ");
        }
    }
}