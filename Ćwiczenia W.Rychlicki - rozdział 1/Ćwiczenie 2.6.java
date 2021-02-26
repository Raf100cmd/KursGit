/* Napisz program, który utworzy dziesięcioelementową tablicę
* znaków i wypełni ją cyframi od 0 do 9  */

public class CyfryTablice {

    public static void main(String[] args) {
        char [] cyfry = new char[10];

        for (int i = 0; i < 10; i++){
            // wg ASCII cyfry od 0 do 9 mieszczą się w oznaczeniu od 48 do 57
            cyfry [i] = (char) (i + 48);
        }
        System.out.println("Cyfry układu dziesiętnego: ");
        System.out.println(cyfry);
    }
}