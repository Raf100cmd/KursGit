import RychlickiWZadania.Ulamek;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class UlamekSteps {


     int fractionInteger;
     int numerator;
     int denominator;
     double fractionAsDecimal;


     int a = fractionInteger;
     int b = numerator;
     int c = denominator;
     double d = fractionAsDecimal;

    Ulamek ulamek;

        @Given("Uzytkownik musi posiadac kalkulator")
        public void Uzytkownik_musi_posiadac_kalkulator() {
            ulamek = new Ulamek();
       }


      @When("Uzytkownik wpisuje liczby {int}, {int}, {int}")
    public void Uzytkownik_wpisuje_liczby(int fractionInteger, int numerator, int denominator) {

           ulamek.setFractionInteger(a);
           ulamek.setNumerator(b);
           ulamek.setDenominator(c);
      }

    @Then("Podana liczbe program zamienil na {double}")
    public void podana_liczbe_program_zamienil_na(double fractionAsDecimal) {
        ulamek.setFractionAsDecimal(d);
        Assert.assertEquals(1.5, fractionAsDecimal,0);
     }

}