/* Napisz program, który utworzy szesnastoelementową tablicę znaków
  i wypełni ją cyframi układu szesnastkowego */


public class CyfrySzesnastkowe {

    public static void main(String[] args) {
        char [] znaki = new char[16];

        // PIERWSZE ROZWIĄZANIE
        System.out.println("Rozwiązanie nr 1");
        for (int i = 0; i < 10; i ++){
            // wg ASCII cyfry od 0 do 9 mieszczą się w oznaczeniu od 48 do 57
            znaki[i] = (char)(i + 48);
        }
        for (int i = 10; i < 16; i ++ ){
            // wg ASCII cyfry od A do F mieszczą się w oznaczeniu od 65 do 70
            // poniżej wpisujemy 55 a nie 65, ponieważ znak [i] na starcie ma 10
            // 10 + 55 = 65
            znaki[i] = (char)(i + 55);
        }
        System.out.println("Cyfry układu szesnastkowego: ");
        System.out.println(znaki);
        System.out.println();

        // DRUGIE ROZWIĄZANIE - przy użyciu klasy Character
        System.out.println("Rozwiązanie nr 2");
        System.out.println("Cyfry układu szesnastkowego: ");
        for (char z : znaki ) {
            System.out.println("Znak: "+z+" Cyfra: "+Character.digit(z, 16)); } // metoda digit
        System.out.println();

        // TRZECIE ROZWIĄZANIE - przy użyciu klasy Character
        System.out.println("Rozwiązanie nr 3");
        System.out.println("Cyfry układu szesnastkowego: ");
        for(int a = 0; a < 16; a++)
       /*     znaki[a] = Character.forDigit(a, 16);
       metoda forDigit zwróci cyfry o wartości większej od 9 jako małe litery
       (abcdef). Aby znaki zamienić na duże litery stosujemy metody - toUpperCase
        */
        znaki [a] = Character.toUpperCase(Character.forDigit(a, 16)); // metoda forDigit
        System.out.println(znaki);
    }
}