package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    private String dressesCategory = "//*[@id=\'block_top_menu\']/ul/li[2]";
    private String yellowColorAvailable = "//*[@id=\'ul_layered_id_attribute_group_3\']/li[7]";

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
    public void clickCategoryDresses() {
        clickElementByxpath(yellowColorAvailable);
        clickElementByxpath(yellowColorAvailable);
    }
    public Boolean getTotalResultsProductsYellow() {
        return isDisplayed(productsYellow);
    }

}
