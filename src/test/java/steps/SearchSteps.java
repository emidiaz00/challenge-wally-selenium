package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchSteps {

    SearchPage search = new SearchPage();

    @Given("^Navego a la pagina de automation practice home Dress$")
    public void navigateToHomeDress() {
        search.navigateToHomeDress();
    }
    @And("^Cliqueo en Dresses$")
    public void clickOnDresses() {
        search.clickOnDresses();
    }
    @When("^verifico que el color amarillo está disponible$")
    public void verifyYellowIsAvailable() {
        search.yellowColorAvailable();
    }
    @And("^cliqueo en la categoria de colores amarillos$")
    public void clickOnCategoryYellowColors() {
        search.clickYellowColorPalette();
    }
    @Then("^obtengo la cantidad de productos de color amarillo$")
    public void getTotalResultsYellowColor() {
        search.getTotalResultsProductsYellow();
    }

}
