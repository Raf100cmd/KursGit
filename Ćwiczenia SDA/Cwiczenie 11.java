/*Napisz program, który pobiera hasło od użytkownika. Program powinien zapytać użytkownika o
wprowadzenie poprawnego hasła. W przypadku gdy wprowadzone hasło będzie poprawne,
program powinien wydrukować na ekranie tekst "Poprawne hasło", w przeciwnym wypadku,
wprowadzone hasło powinno zostać wyświetlone na ekranie, a użytkownik powinien mieć
możliwość ponownie wprowadzić hasło.
 */

import java.util.Scanner;

public class ExerciseEleven {

    public static void main(String[] args) {

        Scanner userPassword = new Scanner(System.in);

        String password;
        String correctPasword = "secret";

        while (true) {
            System.out.println("Podaj hasło");
            password = userPassword.nextLine();

            if (password.equals(correctPasword)){

                System.out.println("Poprawne hasło");
                break;
            } else {

                System.out.println(password);
                System.out.println("Nie poprawne hasło");
            }

        }

    }
}