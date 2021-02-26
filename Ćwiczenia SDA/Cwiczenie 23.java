/* Napisz program, który pobierze wycinek z wybranego ciągu znaków wprowadzonego przez
użytkownika. Zakres wycinka, równiez powinien zostać wybrany przez użytkownika - użytkownik
podaje dwie liczby początek, koniec - numery znaków w podanym wyrażeniu,
 */

import java.util.Scanner;

public class Exercise23Znaki {

    public static void main(String[] args) {

        Scanner userChar = new Scanner(System.in);
        System.out.println("Podaj wyrażenie, które chcesz obciąć");
        String c = userChar.nextLine();
        System.out.println("Podaj początek zakresu (np 0)");
        int a = userChar.nextInt();
        System.out.println("Podaj koniec zakresu (np 7)");
        int b = userChar.nextInt();

        if ((a <= c.length() - 1) && (b <= c.length() - 1)) {

            System.out.println(c.substring(a, b));

        }

        else if (b > c.length() - 1)
        {
            System.out.println("Podana liczba b jest większa od ciągu znaków podanego tekstu");
            System.out.println("Maksymalna liczba znaków w tekście wynosi: " + (c.length() - 1));
        }
    }

}
