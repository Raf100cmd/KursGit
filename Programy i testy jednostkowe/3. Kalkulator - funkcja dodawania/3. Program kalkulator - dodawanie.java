public class Calc {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        int suma = a + b;
        System.out.println(suma);
    }

   private int a;
   private int b;
  private int suma = a + b;
  private int sumaWzor = a + b;

    public Calc() { }
    public Calc (int a, int b, int suma, int sumaWzor){
        this.a = a;
        this.b = b;
        this.suma = suma;
        this.sumaWzor = sumaWzor;
    }

    public int getA() { return a;}

    public void setA(int a) {this.a = a; }

    public int getB() { return b;}

    public void setB(int b) {this.b = b;}

    public int getSuma() {return suma;}

    public void setSuma(int suma) {this.suma = suma;}

    public int getSumaWzor() {return sumaWzor;}

    public void setSumaWzor(int sumaWzor) {this.sumaWzor = sumaWzor;}
}
