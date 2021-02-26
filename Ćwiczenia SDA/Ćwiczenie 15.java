/* Napisz program, który pobiera liczbę całkowitą od użytkownika
 i zwraca liczbę odwróconą.
dla liczby 1234, program powinien zwrócić 4321
dla liczby 654789, program powinien zwrócić 987456
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciseFifteen {

    public static void main(String[] args) {

        Scanner userNumber = new Scanner(System.in);
        System.out.println("Jaką liczbę odwrócić?");
        int createdNumber = userNumber.nextInt();
        int reversed = 0;
        System.out.println("Podana liczba to: " + createdNumber);

        while(createdNumber != 0) {
            int digit = createdNumber % 10; //1. np reszta z dzielenia 69 to 9|No 2 reszta z dzielenia 6 przez 10 to 6
            reversed = reversed * 10 + digit; //1. 0*10 +9 | No 2 9*10 + 6 = 96
            createdNumber /= 10; // 1. liczba 69 pomniejszona o resztę z dzielenia - 60/10 = 6| liczba 6 pomniejszona o 6 - 0/10 = 0
//            System.out.println("digit " + digit);
//            System.out.println("reversed "+ reversed);
//            System.out.println("createdNumber " + createdNumber);
        }

        System.out.println("Wartość odwrócona : " + reversed);



    }
}