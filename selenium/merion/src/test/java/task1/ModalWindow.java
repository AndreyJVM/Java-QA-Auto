package task1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ModalWindow {

    /**
     * Open a page http://the-internet.herokuapp.com/entry_ad
     * In the modal window, click the Close button.
     * Print the text of the element with id = content to the console.
     * */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://the-internet.herokuapp.com/entry_ad");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#modal .modal-footer"))
                        .click();

        System.out.println(driver.findElement(By.cssSelector("#content")).getText());
        driver.quit();
    }
}
