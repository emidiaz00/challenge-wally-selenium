package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private String signInButton = "//a[contains(text(),'Sign in')]";
    private String emailInput = "//input[@id='email']";
    private String passwordInput = "//input[@id='passwd']";
    private String buttonSignIn = "//button[@id='SubmitLogin']";
    private String accountLogin = "//p[contains(text(),'Welcome to your account. Here you can manage all o')]";

    public LoginPage() {
        super(driver);
    }
    public void navigateToSignIn() {
        navigateTo("http://automationpractice.com/index.php");
    }

    public void clickOnSignIn() {
        clickElementByxpath(signInButton);
    }
    public void enterEmail() {
        write(emailInput, "emildsn09@gmail.com");
    }
    public void enterPassword() {
        write(passwordInput, "Password1");
    }
    public void clickOnSignInButton() {
        clickElementByxpath(buttonSignIn);
    }

    public String getAccontMessage() {
        return textFromElement(accountLogin);
    }


}
