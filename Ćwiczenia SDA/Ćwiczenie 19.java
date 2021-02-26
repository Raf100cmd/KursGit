/* Napisz program któy wyswietli choinkę
dla n< 10 elementów
*/

public class Exercise19 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)        // okreslenie liczby wierszy z jakiej składa się choinka pomniejszonej o i - numer poziomu gałęzi choinki
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)  //okreslenie liczby nieparzystej
                System.out.print("*");
            System.out.println();
        }
    }
}
