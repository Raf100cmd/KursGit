/* Utwórz lacuch zawierajacy napis Dzien dobry. Napisz aplikacje,
która wywietli napis w konsoli:
a) pionowo — kazdy znak w odrebnym wierszu,
b) poziomo — znaki rozdzielone dodatkowymi odstepami (tzw. spacjowanie
lub rozstrzelenie tekstu),
c) poziomo — wielkimi literami,
d) poziomo — malymi literami.*/

public class LancuchZnakowDzienDobry {

    public static void main(String[] args) {

        // Rozwiązanie nr 1
        System.out.println("Rozwiązanie nr 1");
        String tekst = "Dzien Dobry";

        System.out.println("a) Tekst pionowo");
        for (int i = 0; i < tekst.length(); i ++){
            System.out.println(tekst.charAt(i));
        }
        System.out.println();
        System.out.println("b) Tekst poziomo");
        for (int i = 0; i < tekst.length(); i ++){
            System.out.print(tekst.charAt(i)+ " " );
        }
        System.out.println();
        System.out.println();
        System.out.println("c) Tekst wielkimi literami");
        System.out.println(tekst.toUpperCase());
        System.out.println();
        System.out.println("c) Tekst malymi literami");
        System.out.println(tekst.toLowerCase());
        System.out.println();

        // Rozwiązanie nr 2 podpunkt a) i podpunkt b)
        System.out.println("Rozwiązanie nr 2");

        System.out.println("a) Tekst pionowo");
        for (char z : tekst.toCharArray() ){
            System.out.println(z);
        }
        System.out.println();
        System.out.println("b) Tekst poziomo");
        for (char z : tekst.toCharArray()) {
            System.out.print(z + " ");
        }
    }
}