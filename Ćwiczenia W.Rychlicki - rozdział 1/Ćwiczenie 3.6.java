/* Napisz program, który utworzy lancuch znakow wypelniony cyframi ukladu szesnastkowego.
 */
public class LancuchZnakowCyfrySzesnastkowe {
    public static void main(String[] args) {
        // rozwiązanie nr 1 - gdy zna się liczby układu szesnastkowego
        System.out.println("Rozwiązanie nr 1 - kiedy zna się liczby układu szesnastkowego");
        String cyfryUkladuSzesnastkowego = "0123456789ABCDEF";
        char [] ukladSzesnastkowy = cyfryUkladuSzesnastkowego.toCharArray();
        System.out.println("Cyfry układu szesnastkowego");
        for (int i = 0; i <= ukladSzesnastkowy.length - 1; i ++){
            System.out.print(ukladSzesnastkowy[i] + " ");
        }

        // rozwiazanie nr 2 - gdy nie zna się liczb ukladu szesnastkowego
        System.out.println();
        System.out.println("Rozwiązanie nr 2 - gdy nie zna się liczb układu szesnastkowego");
        String ciagSzesnastkowy = "";
        for(int i = 0; i < 16; ++i) {
            ciagSzesnastkowy += Character.forDigit(i, 16);
        }
            System.out.print("Cyfry ukladu szesnastkowego: ");
            ciagSzesnastkowy = ciagSzesnastkowy.toUpperCase();
            System.out.println(ciagSzesnastkowy);
    }
}