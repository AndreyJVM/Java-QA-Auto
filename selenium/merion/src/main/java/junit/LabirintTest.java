package junit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.object.factory.WDFactory;
import page.object.page.CartPage;
import page.object.page.MainPage;
import page.object.page.ResultPage;

public class LabirintTest {

    @Test
    public void labirintTest() {
        WebDriver driver = WDFactory.create("chrome");

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.open();
        mainPage.headerElement.searchFor("Java");

        ResultPage resultPage = new ResultPage(driver);
        resultPage.addAllItemsToCart();
        resultPage.headerElement.getIconText();


        CartPage cartPage = resultPage.headerElement.clickCartIcon();
        String counter = cartPage.getCardCounter();
        String price = cartPage.getCartPrice();

        System.out.println("counter = " + counter);
        System.out.println("price = " + price);

        driver.quit();
    }
}