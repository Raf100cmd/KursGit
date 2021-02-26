/* Utwórz lancuch znaków zawierajacy slowo programowanie w jezyku java.
Napisz program, który znaki zawarte w lancuchu bedzie wywietlac w kolejnoci odwrotnej,
od konca do poczatku.
*  */
public class ŁancuchZnakowProgramowanie {
    public static void main(String[] args) {

        //Zadanie 4.6 - lancuch znakow wyswietlany w kolejnosci odwrotnej
        System.out.println("Zadanie 4.6 - lancuch znakow wyswietlony w kolejnosci odwrotnej");
        String zdanie = "Programowanie w jezyku java";
        System.out.println(zdanie);

        for(int i = zdanie.length() - 1; i >=0; --i) {
            System.out.print(zdanie.charAt(i) + " ");
        }
    }
}