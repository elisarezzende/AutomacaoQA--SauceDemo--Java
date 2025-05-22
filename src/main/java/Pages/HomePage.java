package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class HomePage extends BasePage {

    // Element mappings
    private static final String HAMBURGER_MENU_XPATH = "//*[@id=\"menuToggle\"]/input";
    private static final String ONLINE_PRODUCTS_LINK_XPATH = "//*[@id=\"menu\"]/a[3]/li";
    

    // Getter methods for the WebElements

    public WebElement getHamburgerMenuElement() {
        return driver.findElement(By.xpath(HAMBURGER_MENU_XPATH));
    }

    public WebElement getOnlineProductsLinkElement() {
        return driver.findElement(By.xpath(ONLINE_PRODUCTS_LINK_XPATH));
    }
    
}