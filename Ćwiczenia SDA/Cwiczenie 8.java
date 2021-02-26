
import java.util.Scanner;

public class ExerciseEight {

    // Exercise 8
    // Change temerature with Celsius for Kelvin
    // Kelvin for  Fahrenheit
    //  Fahrenheit for Celsius
    // Kelvin for Celsius
    // Celsius for  Fahrenheit
    //  Fahrenheit for Kelvin

    public static void main(String[] args) {

        Scanner readTemperature = new Scanner(System.in);
        System.out.println("Podaj temerature");
        double a = readTemperature.nextDouble();

        Scanner scal = new Scanner(System.in);
        System.out.println("Podaj skalę wypisanej wartości temperatury");
        System.out.println("Do wyboru: KELVIN, CELSIUS, FAHRENHEIT");
        String b = scal.nextLine();

        Scanner scal1 = new Scanner(System.in);
        System.out.println("Podaj temperaturę na jaką chcesz przeliczyć wczesniej podana wartość");
        System.out.println("Do wyboru: KELVIN, CELSIUS, FAHRENHEIT, WSZYSTKIE");
        String c = scal1.nextLine();


                if ((b.equals("KELVIN")) & (c.equals("CELSIUS"))) {

                    double wynik = a - 273.15;
                    System.out.println("Kelvin temperature " + a);
                    System.out.println("Kelvin do Celsius" + " " + wynik);
                }
                else if ((b.equals("CELSIUS")) & (c.equals("KELVIN"))){
                    double wynik = a + 273.15;
                    System.out.println("Celsius temperature " + a);
                    System.out.println("Celsius do Kelvin" + " " + wynik);
                }
                else if ((b.equals("CELSIUS")) & (c.equals("FAHRENHEIT"))){
                    double wynik = 1.8 * a + 32;
                    System.out.println("Celsius temperature " + a);
                    System.out.println("Celsius do Fahrenheit" + " " + wynik);
                }
                else if ((b.equals("FAHRENHEIT")) & (c.equals("CELSIUS"))){
                    double wynik =  a - 32/1.8;
                    System.out.println("Fahrenheit temperature " + a);
                    System.out.println("Fahrenheit do Celsius" + " " + wynik);
                }
                else if ((b.equals("FAHRENHEIT")) & (c.equals("KELVIN"))){
                    double wynik = ( a - 32/1.8) + 273.15;
                    System.out.println("Fahrenheit temperature " + a);
                    System.out.println("Fahrenheit do Kelvin" + " " + wynik);
                }
                else if ((b.equals("KELVIN")) & (c.equals("FAHRENHEIT"))) {
                     double wynik =  (a - 273.15) * 1.8 + 32;
                    System.out.println("Kelvin temperature " + a);
                    System.out.println("Kelvin do Fahrenheit" + " " + wynik);
                 }
                else if ((b.equals("KELVIN")) & (c.equals("WSZYSTKIE"))) {
                    double wynik =  (a - 273.15) * 1.8 + 32;
                    double wynik1 = a - 273.15;
                    System.out.println("Kelvin temperature " + a);
                    System.out.println("Kelvin do Fahrenheit" + " " + wynik);
                    System.out.println("Kelvin do Celsius" + " " + wynik1);
                }
                else if ((b.equals("CELSIUS")) & (c.equals("WSZYSTKIE"))) {
                    double wynik =  1.8 * a + 32;
                    double wynik1 = a + 273.15;
                    System.out.println("Celsius temperature " + a);
                    System.out.println("Celsius do Fahrenheit" + " " + wynik);
                    System.out.println("Celsius do Kelvin" + " " + wynik1);
                }
                else if ((b.equals("FAHRENHEIT")) & (c.equals("WSZYSTKIE"))) {
                    double wynik =  a - 32/1.8;
                    double wynik1 = ( a - 32/1.8) + 273.15;
                    System.out.println("Fahrenheit temperature " + a);
                    System.out.println("Fahrenheit do Celsius" + " " + wynik);
                    System.out.println("Fahrenheit do Kelvin" + " " + wynik1);
                }
    }
}

