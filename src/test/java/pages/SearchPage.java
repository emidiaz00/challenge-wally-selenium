package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    private String dressesCategory = "//*[@id=\'block_top_menu\']/ul/li[2]";
    private String yellowColorAvailable = "//*[@id=\'layered_id_attribute_group_16\']";

    private String productsYellow = "//span[contains(text(),'There are 5 products.')]";

    public SearchPage() {
        super(driver);
    }

    public void navigateToHomeDress() {
        navigateTo("http://automationpractice.com/");

    }
    public void clickOnDresses() {
        clickElementByxpath(dressesCategory);
    }
    public Boolean yellowColorAvailable() {
        return isDisplayed(yellowColorAvailable);
    }
    public void clickYellowColorPalette() {
        clickElementById(yellowColorAvailable);
    }

    public Boolean getTotalResultsProductsYellow() {
        return isDisplayed(productsYellow);
    }

}
