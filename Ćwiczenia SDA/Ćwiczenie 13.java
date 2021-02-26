/* Napisz program, który stworzy tablicę dla 10 elementów typu integer.
Program powinien wypełnić tablicę losowymi liczbami z zakresu od [-10..10],
 a następnie:
wydrukuje zawartość tablicy na ekran
wydrukuje najmniejszą (minimalną) wartość z tablicy
wydrukuje największą (maksymalną) wartość z tablicy */

public class ExerciseThirteen {

    public static void main(String[] args) {

        // określam losowosc

        double [] tablica = new double[10];

        for(int c = 0 ; c < 10 - 1 ; c ++){

            tablica[c] = Math.random() * 20 - 10;

        }

        double maksimum = tablica[0];
        double minimum = tablica[0];
        double suma = 0;

        for (double wartosc :tablica) {

            if (wartosc < minimum) {
                minimum = wartosc;
            }
            if (wartosc > maksimum){
                maksimum = wartosc;
            }

            suma = suma + wartosc;
            System.out.println("Wartość z tablicy: " + wartosc + " ");
        }

        System.out.println("Najmniejsza wartość to " +  minimum);

        System.out.println("Największa wartość to " +  maksimum);

        System.out.println("średnia arytmetyczna wszystkich elementów to: " + suma/tablica.length);
    }
}
