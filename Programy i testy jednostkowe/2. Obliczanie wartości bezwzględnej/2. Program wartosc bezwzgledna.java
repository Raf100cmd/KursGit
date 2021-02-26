/* Napisz program wyswietlajacy wartosc bezwzgledna liczv calkowitej.
*  Nastepnie wykonaj testy jednostkowe dla liczby dodatniej i liczby ujemnej */
public class WartoscBezwzgledna1 {

    private int a;
    private int b;
    private int abs = Math.abs(a);
    private int abs1 = Math.abs(b);

 
    public WartoscBezwzgledna1() {
    }

    public WartoscBezwzgledna1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getAbs() {
        return abs;
    }
    public void setAbs(int abs) {
        this.abs = abs;
    }
    public int getAbs1() {
        return abs1;
    }
    public void setAbs1(int abs1) {
        this.abs1 = abs1;
    }
}