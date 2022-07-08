package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {

    LoginPage automationPractice = new LoginPage();

    // Login Exitoso
    @Given("^Navego a la pagina de automation practice$")
    public void navegoAutPracticePage() {
        automationPractice.navigateToAutomationPracticeRegister();
    }
    @And("^Cliqueo en Sign In$")
    public void cliqueoSignIn() {
        automationPractice.ClickSignInButton();
    }
    @And("^verifico create an account esta visible$")
    public void verificoCreateAnAccountEstaVisible() {
        automationPractice.createAnAccountTextIsVisible();
    }
    @And("^Ingreso el (.+)")
    public void ingresoEmail(String emailSignIn) {
        automationPractice.enterEmailSignIn(emailSignIn);
    }
    @And("^Cliqueo en create an account$")
    public void cliqueoBotonCrearCuenta() {
        automationPractice.clickButtonCreateAnAccount();
    }
    @When("^completo los campos y el campo (.+)$")
    public void completarDatosUsuario(String emailSignIn) {
        automationPractice.enterInformationUser(emailSignIn);
        automationPractice.ClickCreateAnAccount();
    }
    @Then("^verifico que la pagina esta visible$")
    public void crearCuenta() {
        automationPractice.resultAccountCreatedIsVisible();
        automationPractice.clickSignOut();
    }


    // Login fallido
    @When("^completo los datos$")
    public void ingresoPasswordFallida() {
        automationPractice.enterFailedPassword();
    }
    @Then("^verifico que la contraseña es incorrecta$")
    public void verificoMensajeDePasswordFallido() {
        Assert.assertEquals("passwd", automationPractice.getMessagePassword());
        automationPractice.clickSignOut();
    }








}
