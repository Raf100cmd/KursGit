import RychlickiWZadania.Calc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class CalcSteps {

    Calc calc;
   private int a;
   private int b;
  private int suma = a + b;
  private  int sumaWzor = a + b;
    @Given("I test calculator")
    public void i_test_calculator() {
        calc = new Calc(){};
    }

    @When("I add {int} and {int}")
    public void i_add_and(int a, int b) {
        calc.setA(a);
        calc.setB(b);
    }

    @And("Expected result is {int}")
    public  void Expected_result_is(int sumaWzor){
        calc.setSumaWzor(sumaWzor);
    }

    @Then("result is {int}")
    public void result_is(int suma) {
        calc.setSuma(suma);
     Assert.assertEquals(calc.getSumaWzor(), calc.getSuma());
    }


}