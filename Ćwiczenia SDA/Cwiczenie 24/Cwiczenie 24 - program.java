import java.util.Scanner;

public class Zadanie24Demo {



        public static void main(String[] args) {

            Zadanie24 data = new Zadanie24();

            Scanner klawiatura = new Scanner(System.in);


            System.out.print("Wprowadź dzień: ");
            data.setDzien(klawiatura.nextInt());

            System.out.print("Wprowadź miesiąc: ");
            data.setMiesiac(klawiatura.nextInt());

            System.out.print("Wprowadź rok: ");
            data.setRok(klawiatura.nextInt());

            data.sformatujIWyswietlDate();

        }
    }

