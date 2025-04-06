import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static javax.swing.text.html.CSS.getAttribute;

public class HomeInternet {
    By phonenumberLocator = By.id("internet-phone");
    By sumLocator = By.id("internet-sum");
    By emailLocator = By.id("internet-email");
    private final WebDriver  driver;
    public HomeInternet(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public HomeInternet checkPhonenumber(String phonenumber) {
        driver.findElement(phonenumberLocator).getAttribute("placeholder");
        System.out.println(getAttribute("placeholder"));
        Assertions.assertEquals("Номер телефона", getAttribute("placeholder"));
        return this;
    }
    public HomeInternet  checkSumLocator(String sum){
        driver.findElement(sumLocator).getAttribute("placeholder");
        System.out.println(getAttribute("placeholder"));
        Assertions.assertEquals("Сумма", getAttribute("placeholder"));
        return this;
    }
    public HomeInternet checkEmailLocator(String email){
        driver.findElement(emailLocator).getAttribute("placeholder");
        System.out.println(getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека", getAttribute("placeholder"));
        return this;
    }

}

