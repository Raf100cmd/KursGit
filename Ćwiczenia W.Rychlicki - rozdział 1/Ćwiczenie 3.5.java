/* Napisz program, który utworzy lancuch znakow wypeniony cyframi od 0 do 9 */

public class LancuchZnakowCyfry {
    public static void main(String[] args) {

        String cyfry = "0123456789";
        // Rozwiązanie nr 1
        System.out.println("Rozwiązanie nr 1 - ciąg znaków poziomo - rosnąco");
        System.out.println(cyfry);

        // Rozwiązanie nr 2
        System.out.println("Rozwiązanie nr 2 - ciąg znaków poziomo - rosnąco");
        char [] znaki = cyfry.toCharArray();

        for (int i = 0; i <= cyfry.length() - 1; i ++){
            System.out.print(znaki[i] + " ");
        }
        // Zadanie 4.7a
        /*  Na podstawie rozwiązania nr 2 wypisz ciąg znaków:
        * a) pionowo - rosnaco
        * b) pionowo - malejaco
        * c) poziomo - malejąco   */
        System.out.println();
        System.out.println("Rozwiązanie nr 2a - Ciąg znaków pionowo - rosnąco");
        for (int i = 0; i <= cyfry.length() - 1; i ++){
            System.out.println(znaki[i]);
        }
        System.out.println("Rozwiązanie nr 2b - Ciąg znaków pionowo - malejąco");
        for (int i = cyfry.length()-1; i >= 0; i --){
            System.out.println(znaki[i]);
        }
        System.out.println("Rozwiązanie nr 2c - Ciąg znaków poziomo -  malejąco");
        for (int i = cyfry.length()-1; i >= 0; i --) {
            System.out.print(znaki[i] + " ");
        }
    }
}