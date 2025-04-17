
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static javax.swing.text.html.CSS.getAttribute;
import static org.testng.Assert.assertEquals;

public class InstallmentPlan {
    private final WebDriver driver;

    public InstallmentPlan(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public InstallmentPlan checkAccountnumber() {
        WebElement element = driver.findElement(By.id("score-instalment"));
        System.out.println(element.getAttribute("placeholder"));
     assertEquals("Номер счета на 44", element.getAttribute("placeholder"));
        return this;
    }

    public InstallmentPlan checkSumLocator() {
        WebElement element = driver.findElement(By.id("instalment-sum"));
        System.out.println(element.getAttribute("placeholder"));
        assertEquals("Сумма", element.getAttribute("placeholder"));
        return this;
    }

    public InstallmentPlan checkEmailLocator() {
        WebElement element = driver.findElement(By.id("instalment-email"));
        System.out.println(element.getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека", element.getAttribute("placeholder"));
        return this;
    }

}
