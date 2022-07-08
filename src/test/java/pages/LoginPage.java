package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private String signInButton = "//a[contains(text(),'Sign in')]";
    private String emailInput = "//input[@id='email']";
    private String passwordInput = "//input[@id='passwd']";
    private String buttonSignIn = "//button[@id='SubmitLogin']";
    private String accountLogin = "//p[contains(text(),'Welcome to your account. Here you can manage all o')]";

    private String passwordFailed = "//*[@id=\'center_column\']/div[1]/ol/li";
    private String buttonSignOut = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]";

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
    public void clickSignOut() {
        clickElementByxpath(buttonSignOut);
    }

    public String getAccountMessage() {
        return textFromElement(accountLogin);
    }

    public void enterFailedPassword() {
        write(emailInput, "emildsn09@gmail.com");
        write(passwordInput, "pasw");
    }

    public String getMessagePasswordFailed() {
        return textFromElement(passwordFailed);
    }


}
