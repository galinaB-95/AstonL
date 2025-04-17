
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static javax.swing.text.html.CSS.getAttribute;
import static org.testng.Assert.assertEquals;

public class HomeInternet {
    private final WebDriver driver;

    public HomeInternet(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public HomeInternet checkPhonenumber() {
        WebElement element = driver.findElement(By.id("internet-phone"));
        System.out.println(element.getAttribute("placeholder"));
        assertEquals("Номер абонента", element.getAttribute("placeholder"));
        return this;

    }

    public HomeInternet checkSumLocator() {
        WebElement element = driver.findElement(By.id("internet-sum"));
        System.out.println(element.getAttribute("placeholder"));
       assertEquals("Сумма", element.getAttribute("placeholder"));
        return this;

    }

    public HomeInternet checkEmailLocator() {
        WebElement element = driver.findElement(By.id("internet-email"));
        System.out.println(element.getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека", element.getAttribute("placeholder"));
        return this;
    }

}

