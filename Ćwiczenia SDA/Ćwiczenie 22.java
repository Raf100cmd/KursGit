/* Napisz program, który porówna dwa ciągi znaków wprowadzone przez użytkownika. Program
powinien zwrócić wartość True jeśli obiekty są równe, w przeciwnym przypadku program
powinien zwrócić false. */

import java.util.Scanner;

public class Exercise22Lancuch {

    public static void main(String[] args) {

        Scanner userTekst = new Scanner(System.in);
        System.out.println("Podaj pierwszy ciąg znaków");
        String a = userTekst.nextLine();
        System.out.println("Podaj drugi ciąg znaków");
        String b = userTekst.nextLine();

        if (a.equals(b)){

            System.out.println( "Długość znaków w obiekcie: " + a + " = " + a.length());
            System.out.println("Długość znaków w obiekcie: " + b + " = " + b.length());
            System.out.println("Obiekty są sobie równe");

        } else if (!(a.equals(b)))
            {
                System.out.println( "Długość znaków w obiekcie: " + a + " = " + a.length());
                System.out.println("Długość znaków w obiekcie: " + b + " = " + b.length());
                System.out.println("Obiekty nie są sobie równe");
            }
    }
}
