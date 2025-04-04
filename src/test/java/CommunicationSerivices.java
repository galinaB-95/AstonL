import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static javax.swing.text.html.CSS.getAttribute;

public class CommunicationSerivices{
    By phonenumberLocator = By.id("connection-phone");
    By sumLocator = By.id("connection-sum");
    By emailLocator = By.id("connection-email");
    private final WebDriver  driver;
    public CommunicationSerivices(WebDriver  driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
public CommunicationSerivices checkPhonenumber(String phonenumber) {
    driver.findElement(phonenumberLocator).getAttribute("placeholder");
    System.out.println(getAttribute("placeholder"));
    Assertions.assertEquals("Номер телефона", getAttribute("placeholder"));
    return this;
}


}