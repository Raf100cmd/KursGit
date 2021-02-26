mport io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class WartoscBezwzgledna1Steps {

    WartoscBezwzgledna1 kalkulatorek;

    @Given("Uzytkownik posiada kalkulator z funkcja obliczenia liczby bezwglednej")
    public void Uzytkownik_posiada_kalkulator_z_funkcja_obliczenia_liczby_bezwglednej(){
        kalkulatorek = new WartoscBezwzgledna1();
    }

    @When("Uzytkownik wpisal liczbe {int}")
    public void Uzytkownik_wpisal_liczbe_(int a){
        kalkulatorek.setA(a);
    }

    @Then("Uzytkownik powinien otrzymac wartosc {int}")
    public void Uzytkownik_powinien_otrzymac_wartosc (int abs){
        kalkulatorek.setAbs(abs);
        Assert.assertEquals(10, kalkulatorek.getAbs(), 0);

    }

    @When("Uzytkownik zapisal liczbe {int}")
    public void Uzytkownik_zapisal_liczbe_ (int b){
        kalkulatorek.setB(b);
    }

    @Then("Uzytkownik powinien miec wartosc {int}")
    public void Uzytkownik_powinien_miec_wartosc (int abs1){
        kalkulatorek.setAbs1(abs1);
        Assert.assertEquals(3, kalkulatorek.getAbs1(), 0);
    }

}