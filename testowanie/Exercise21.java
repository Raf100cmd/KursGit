/* Napisz program, który sprawdzi czy liczba/ciąg znaków wprowadzonych przez użytkownika jest
palindromem.
Czym jest palindrom? * Pobierz dane od użytkownika * Przypisz pobrane dane do zmiennej *
Odwróć wprowadzoną liczbe/ciąg znaków * Porównaj odwróconą wartość z daną wprowadzoną
przez użytkownika * Jeśli liczba/ciąg znaków jest palindromem, wyświetl odpowiedni komentarz
* Jeśli nie, wydrukuj komunikat "To nie jest palindrom"
 */

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {

        Scanner userWord = new Scanner(System.in);
        System.out.println("Wpisz tekst");
        String s = userWord.nextLine();

        System.out.println(isPalindrome(s));
    }

   static boolean isPalindrome (String s)
    {
        for (int i = 0 ;i < s.length()/2; i++ )
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
            {
                System.out.println("To nie jest palindrom");
                return  false;
            }
        System.out.println("To jest palindrom");
        return true;
   }
}
