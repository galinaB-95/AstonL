import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static javax.swing.text.html.CSS.getAttribute;

public class Arrears {
    By accountnumberLocator = By.id("score-arrears");
    By sumLocator = By.id("instalment-sum");
    By emailLocator = By.id("instalment-email");
    private final WebDriver driver;
    public Arrears(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public Arrears checkAccountnumber(String accountnumber) {
        driver.findElement(accountnumberLocator).getAttribute("placeholder");
        System.out.println(getAttribute("placeholder"));
        Assertions.assertEquals("Номер счета на 2073", getAttribute("placeholder"));
        return this;
    }
    public Arrears checkSumLocator(String sum){
        driver.findElement(sumLocator).getAttribute("placeholder");
        System.out.println(getAttribute("placeholder"));
        Assertions.assertEquals("Сумма", getAttribute("placeholder"));
        return this;
    }
    public Arrears checkEmailLocator(String email){
        driver.findElement(emailLocator).getAttribute("placeholder");
        System.out.println(getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека", getAttribute("placeholder"));
        return this;
    }

}
