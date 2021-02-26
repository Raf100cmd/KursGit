/* napisz program wyświetlajacy ułamki */
public class Ulamek {

   private int fractionInteger;
   private int numerator;
   private int denominator;
   private double fractionAsDecimal;

    public void setFractionAsDecimal(double fractionAsDecimal) {
        this.fractionAsDecimal = fractionAsDecimal;
    }

    public void setFractionInteger(int fractionInteger) {
        this.fractionInteger = fractionInteger;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public  Ulamek(){}

    public Ulamek(int fractionInteger, int numerator, int denominator){

        this.fractionInteger = fractionInteger;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getFractionInteger() {
        return fractionInteger;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double getFractionAsDecimal(){
        return fractionInteger + (double) numerator/denominator;
    }

}