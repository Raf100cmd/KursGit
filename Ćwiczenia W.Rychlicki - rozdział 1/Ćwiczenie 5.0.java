/* Napisz program, który w formie tabeli przedstawi działanie operatorów logicznych
 */
public class OperatoryLogiczne {

        public static void main(String args[]) {

            boolean [] argument = {false, true};
            String negacja = "Operator negacji (NOT) - !";
            String koniunkcja = "Operator koniunkcji (AND) & lub &&";
            String alternatywa = "Operator alternatywy (OR) | lub ||";
            String tekst [] = {negacja, koniunkcja, alternatywa};
            int wyrażenie;

            // TABELA DLA NEGACJI
            System.out.println(tekst[0]);                                                              // tworzenie tytułu tabeli
            for (wyrażenie = 0; wyrażenie <=negacja.length(); wyrażenie ++ ){ System.out.print("*");} // tworzenie podkreślenia
            System.out.println();
            System.out.println("\t p \t\t !p");                                                       // tworzenie danych
            for (boolean p: argument){ System.out.println("\t"+ p+"\t"+!p);}                          // tworzenie danych
            System.out.println();
            for (wyrażenie = 0; wyrażenie <=negacja.length(); wyrażenie ++ ){System.out.print("*");} // tworzenie podkreślenia
            System.out.println();

            // TABELA DLA KONIUNKCJI
            System.out.println(tekst[1]);                                                               // tworzenie tytułu tabeli
            for (wyrażenie = 0; wyrażenie <=koniunkcja.length(); wyrażenie ++ ){System.out.print("*");} // tworzenie podkreślenia
            System.out.println();
            System.out.println("\t p\t\t q\t\tp & q");                                                  // tworzenie danych
            for (boolean p: argument){
                for(boolean q: argument) {System.out.println("\t"+p+"\t"+q+"\t"+(p & q));}              // tworzenie danych
            }
            System.out.println();
            for (wyrażenie = 0; wyrażenie <=koniunkcja.length(); wyrażenie ++ ){System.out.print("*");} // tworzenie podkreślenia
            System.out.println();

            // TABELA DLA ALTERNATYWY
            System.out.println(tekst[2]);                                                               // tworzenie tytułu tabeli
            for (wyrażenie = 0; wyrażenie <=alternatywa.length(); wyrażenie ++ ){System.out.print("*");} // tworzenie podkreślenia
            System.out.println();
            System.out.println("\t p\t\t q\t\tp | q");                                                  // tworzenie danych
            for(boolean p: argument){
                for(boolean q: argument){System.out.println("\t"+p+"\t"+q+"\t"+(p | q));}               // tworzenie danych
            }
            System.out.println();
            for (wyrażenie = 0; wyrażenie <=alternatywa.length(); wyrażenie ++ ){System.out.print("*");} // tworzenie podkreślenia
            System.out.println();
        }
}