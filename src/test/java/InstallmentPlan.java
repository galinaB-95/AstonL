import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static javax.swing.text.html.CSS.getAttribute;

public class InstallmentPlan {
    By accountnumberLocator = By.id("score-instalment");
    By sumLocator = By.id("instalment-sum");
    By emailLocator = By.id("instalment-email");
    private final WebDriver driver;
    public InstallmentPlan(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public InstallmentPlan checkAccountnumber(String accountnumber) {
        driver.findElement(accountnumberLocator).getAttribute("placeholder");
        System.out.println(getAttribute("placeholder"));
        Assertions.assertEquals("Номер счета на 44", getAttribute("placeholder"));
        return this;
    }
    public InstallmentPlan checkSumLocator(String sum){
        driver.findElement(sumLocator).getAttribute("placeholder");
        System.out.println(getAttribute("placeholder"));
        Assertions.assertEquals("Сумма", getAttribute("placeholder"));
        return this;
    }
    public InstallmentPlan checkEmailLocator(String email){
        driver.findElement(emailLocator).getAttribute("placeholder");
        System.out.println(getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека", getAttribute("placeholder"));
        return this;
    }

}
