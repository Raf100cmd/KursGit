/*Napisz program, który pobierze od użytkownika,
dodatnią liczbę całkowitą, a następnie wypisze
wszystkie liczby nieparzyste, nie większe od tej liczby. */

public class ExerciseTvelve {

    public static void main(String[] args) {

        Scanner Klawiatura = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int wartoscZKlawiatura = Klawiatura.nextInt();

        System.out.println(wartoscZKlawiatura);
        System.out.println("Wyświetl liczby nieparzyste i mniejsze od " + wartoscZKlawiatura);
        int liczba = 1;
        while (liczba <= wartoscZKlawiatura) {
            if (liczba % 2 == 1) {
                System.out.println("LICZBA NIEPARZYSTA: " + liczba);
            }
            liczba++;
        }
    }
}