import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test1 {
    @Test
    public void init() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        Assertions.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")).getText(), "Онлайн пополнение\n" +
                        "без комиссии");
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")).getText();
        driver.quit();
    }

    @Test
    public void logo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        driver.findElement(By.xpath("//ul[1]"));
    }

    @Test
    public void link() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree"))).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//section/div/a")).click();
        driver.quit();

    }

    @Test
    public void keep() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        //new WebDriverWait(driver, Duration.ofSeconds(10)).
        //until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree"))).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//from[@id='pay-connection']/div[1]")).sendKeys("297777777");
    }


}//*[@id="cookie-agree"]
// driver.findElement(By.id("cookie-agree")).click();


//*[@id="pay-section"]/div/div/div[2]/section/div/a


//*[@id="pay-section"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img
//*[@id="pay-section"]/div/div/div[2]/section/div/div[2]/ul





