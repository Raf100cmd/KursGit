/* Napisz program wyswietlajacy wartosc bezwzgledna liczv calkowitej.
*  Nastepnie wykonaj testy jednostkowe dla liczby dodatniej i liczby ujemnej */
public class WartoscBezwzgledna1 {
    public static void main(String[] args) {
        System.out.println("Na potrzeby sprawdzenia programu uruchomimy sam program");
        System.out.println("Dane do uruchomienia: liczba dodatnia = 10, liczba ujemna = -3");
        int a = 10;
        int b = -3;
        System.out.println("a wynosi: "+ a);
        System.out.println("b wynosi: "+ b);
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));
    }

        private int a;
        private int b;
        private int abs = Math.abs(a);
        private int abs1 = Math.abs(b);


    public WartoscBezwzgledna1() {
        }

    public WartoscBezwzgledna1( int a, int b){
            this.a = a;
            this.b = b;
        }
        public int getA () {
            return a;
        }
        public void setA ( int a){
            this.a = a;
        }
        public int getB () {
            return b;
        }
        public void setB ( int b){
            this.b = b;
        }
        public int getAbs () {
            return abs;
        }
        public void setAbs ( int abs){
            this.abs = abs;
        }
        public int getAbs1 () {
            return abs1;
        }
        public void setAbs1 ( int abs1){
            this.abs1 = abs1;
        }

}
