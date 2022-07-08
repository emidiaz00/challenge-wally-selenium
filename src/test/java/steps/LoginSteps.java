package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {

    LoginPage login = new LoginPage();

    @Given("^Navego a la pagina de automation practice al login$")
    public void iAmOnTheAutomationPractice() {
        login.navigateToSignIn();
    }
    @When("^Ingreso usuario y contraseña validos$")
    public void enterUserAndEmailLogin() {
        login.clickOnSignIn();
        login.enterEmail();
        login.enterPassword();
    }
    @Then("^verifico que el login se realizó correctamente$")
    public void assertLoginWasSucess() {
        login.clickOnSignInButton();
        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", login.getAccontMessage());
    }
}
