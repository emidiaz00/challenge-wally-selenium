package pages;


public class RegistroPage extends BasePage {

    private String signInButton = "//a[contains(text(),'Sign in')]";
    private String createAnAccountText = "//button[@id='SubmitCreate']";

    private String inputEmailSignIn = "//input[@id='email_create']";
    private String nameInputField = "//input[@id='customer_firstname']";

    private String buttonCreateAnAccount = "//*[@id=\'SubmitCreate\']";
    private String buttonGender = "//input[@id='id_gender1']";

    private String emailInputRegister = "//input[@id='email']";
    private String passwordInputRegister = "//input[@id='passwd']";
    private String dateOfBirth = "//option[contains(text(),'1')]";
    private String month = "//option[contains(text(),'December')]";
    private String year = "//option[contains(text(),'2000')]";
    private String firstNameRegister = "//input[@id='firstname']";
    private String lastNameRegister = "//input[@id='customer_lastname']";
    private String lastNameRegisterAddress = "//input[@id='lastname']";
    private String compayRegister = "//input[@id='company']";
    private String addressRegister = "//input[@id='address1']";
    private String countryRegister = "//option[contains(text(),'United States')]";
    private String stateRegister = "//option[contains(text(),'Florida')]";
    private String cityRegister = "//input[@id='city']";
    private String zipCodeRegister = "//input[@id='postcode']";
    private String mobileNumberRegister = "//input[@id='phone_mobile']";
    private String createAnAccountButtonRegister = "//span[normalize-space()='Register']";
    private String accountCreatedAssert = "//p[@class='info-account']";

    private String passwordFailed = "//b[contains(text(),'passwd')]";

    private String buttonSignOut = "//*[@id=\'header\']/div[2]/div/div/nav/div[2]/a";

    public RegistroPage() {
        super(driver);
    }

    public void navigateToAutomationPracticeRegister() {
        navigateTo("http://automationpractice.com/index.php");
    }

    public void ClickSignInButton() {
        clickElementByxpath(signInButton);
    }
    public String createAnAccountTextIsVisible() {
        return textFromElement(createAnAccountText);
    }
    public void enterEmailSignIn(String emailSignIn) {
        write(inputEmailSignIn, emailSignIn);
    }
    public void clickButtonCreateAnAccount() {
        clickElementByxpath(buttonCreateAnAccount);
    }

    public void enterInformationUser(String emailSignIn) {
        clickElementByxpath(buttonGender);
        write(nameInputField, "Emiliano");
        write(lastNameRegister, "Diaz");
        write(emailInputRegister, emailSignIn);
        write(passwordInputRegister,"Password123");
        clickElementByxpath(dateOfBirth);
        clickElementByxpath(month);
        clickElementByxpath(year);
        write(firstNameRegister,"Emiliano");
        write(lastNameRegisterAddress,"Diaz");
        write(compayRegister,"logitech");
        write(addressRegister,"St Lake 500");
        write(cityRegister,"Florida");
        clickElementByxpath(stateRegister);
        write(zipCodeRegister,"00000");
        clickElementByxpath(countryRegister);
        write(mobileNumberRegister,"11444444444");
        clickElementByxpath(createAnAccountButtonRegister);
    }
    public void enterFailedPassword() {
        clickElementByxpath(buttonGender);
        write(nameInputField, "Emiliano");
        write(lastNameRegister, "Diaz");
        write(emailInputRegister, "emildsn0000@gmail.com");
        write(passwordInputRegister, "pass");
        clickElementByxpath(dateOfBirth);
        clickElementByxpath(month);
        clickElementByxpath(year);
        write(firstNameRegister,"Emiliano");
        write(lastNameRegisterAddress,"Diaz");
        write(compayRegister,"logitech");
        write(addressRegister,"St Lake 500");
        write(cityRegister,"Florida");
        clickElementByxpath(stateRegister);
        write(zipCodeRegister,"00000");
        clickElementByxpath(countryRegister);
        write(mobileNumberRegister,"11444444444");
        clickElementByxpath(createAnAccountButtonRegister);
    }

    public String getMessagePassword() {
        return textFromElement(passwordFailed);
    }
    public void ClickCreateAnAccount() {
        clickElementByxpath(createAnAccountButtonRegister);
    }
    public String resultAccountCreatedIsVisible() {
        return textFromElement(accountCreatedAssert);
    }
    public void clickSignOut() {
        clickElementByxpath(buttonSignOut);
    }
}
