/* Uruchom aplikacje, której kod zrodlowy przedstawiono na listingu 3. Na podstawie
obserwacji wyników dzialania programu opisz dzialanie uzytych metod klasy String. */
public class OperacjeString {

    public static void main(String args[]) {
        // ponizsza komenda wyswietla tekst Zadania z programowania
        System.out.println("Zadania z programowania.");
        // ponizsza komenda wyswietli znak kryjacy sie pod cyfra 0
        System.out.println("Zadania z programowania.".charAt(0));
        // ponizsza komenda wyswietli długosc lancucha znakow
        System.out.println("Zadania z programowania.".length());
        // ponizsza komenda wyswietli znak kryjacy sie pod cyfra 23
        System.out.println("Zadania z programowania.".charAt(23));
        // ponizsza komenda wyswietli tekst z samymi duzymi literami
        System.out.println("Zadania z programowania.".toUpperCase());
        // ponizsza komenda wyswietli tekst z samymi malymi literami
        System.out.println("Zadania z programowania.".toLowerCase());
        // ponizsza komenda wyswietli indeks pod jakim widnieje znak 'z'
        System.out.println("Zadania z programowania.".indexOf('z'));
        // ponizsza komenda wyswietli inkeks pod jakim zaczyna się ciąg znakow "prog"
        System.out.println("Zadania z programowania.".indexOf("prog"));
        // ponizsza komenda zamieni znak '.' na znak '?'
        System.out.println("Zadania z programowania.".replace('.', '?'));
        // ponizsza komenda zamieni lancuch znakow "adania" na lancuch  znakow "dania"
        System.out.println("Zadania z programowania.".replace("adania", "dania"));
        // ponizsza komenda zamieni wszystkie ciagi znakow "ania" na ciagi znakow "anka"
        System.out.println("Zadania z programowania.".replaceAll("ania", "anka"));
        // ponizsza komenda zamieni pierwszy ciag znakow "ania" na ciag znakow "anka"
        System.out.println("Zadania z programowania.".replaceFirst("ania", "anka"));
        // ponizsza komenda wyswietli ciąg znakow od cyfry 10
        System.out.println("Zadania z programowania.".substring(10));
        // ponizsza komenda wyswietli ciag znakow od cyfry 10 do cyfry 16
        System.out.println("Zadania z programowania.".substring(10, 17));
        // ponizsza komenda pozwoli na dopisanie/nadpisanie do istniejacego lancucha znakow nowy lancuch
        // Pierwszy znak w dolaczanym ciagu jest znakiem specjalnym \b (backspace)
        // i spowoduje skasowanie ostatniego znaku (kropki) w lancuchu wyjciowym.
        System.out.println("Zadania z programowania.".concat("\b z podpowiedziami."));
        // ponizsza komenda pozwoli na dopisanie/nadpisanie do istniejacego lancucha znakow nowy lancuch
        System.out.println("Zadania z programowania."+"\b"+ " z odpowiedziami.");


        // CWICZENIE 4.2
        System.out.println();
        System.out.println("CWICZENIE 4.2");
        String napis = "Tester oprogramowania.";
        System.out.println(napis);
        System.out.println(napis.charAt(0));
        System.out.println(napis.length());
        System.out.println(napis.charAt(21));
        System.out.println(napis.toUpperCase());
        System.out.println(napis.toLowerCase());
        System.out.println(napis.indexOf('r'));
        System.out.println(napis.indexOf("mowania"));
        System.out.println(napis.replace('.', '!'));
        System.out.println(napis.replace("Tester", "Testerka"));
        System.out.println(napis.substring(8));
        System.out.println(napis.substring(10, 19));
        System.out.println(napis.concat("\b i programista jezyka JAVA."));
        System.out.println(napis+ "\b" +" i programista w jednej osobie." );
    }
}