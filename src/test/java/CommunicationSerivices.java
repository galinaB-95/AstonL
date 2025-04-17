
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static javax.swing.text.html.CSS.getAttribute;
import static org.testng.Assert.assertEquals;

public class CommunicationSerivices {
    private final WebDriver driver;

    public CommunicationSerivices(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public CommunicationSerivices checkPhonenumber() {
        WebElement element = driver.findElement(By.id("connection-phone"));
        System.out.println(element.getAttribute("placeholder"));
       assertEquals("Номер телефона", element.getAttribute("placeholder"));
        return this;
    }

    public CommunicationSerivices checkSumLocator() {
        WebElement element = driver.findElement(By.id("connection-sum"));
        System.out.println(element.getAttribute("placeholder"));
        assertEquals("Сумма", element.getAttribute("placeholder"));
        return this;
    }

    public CommunicationSerivices checkEmailLocator() {
        WebElement element = driver.findElement(By.id("connection-email"));
        System.out.println(element.getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека", element.getAttribute("placeholder"));
        return this;
    }

}