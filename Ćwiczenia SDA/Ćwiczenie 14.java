/*Napisz program, który wydrukuje tabliczke mnożenia
 dla zakresu podanego przez użytkownika. */

import java.util.Scanner;

public class ExerciseFourteen {

    public static void main(String[] args) {

        Scanner wartoscA = new Scanner(System.in);
        Scanner wartoscB = new Scanner(System.in);

        int a,b,c,d;

        System.out.println("Podaj liczy do zakresu tabliczki mnożenia");


        a = wartoscA.nextInt();
        b = wartoscB.nextInt();

        for (c = a;c <= a ;c ++) {
            System.out.println("Tabliczka mnożenia dla liczby: " + a);
            for (d = 1;d <= b ;d++){

                System.out.println(c + " * " + d + " = " + (c*d));
            }


        }
    }
}