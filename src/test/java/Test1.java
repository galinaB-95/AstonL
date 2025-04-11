import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test1 {
    private WebDriver driver;
    private Cookie cookie;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree"))).click();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void end() {
        driver.quit();
    }

    @Test
    public void init() {
        WebElement block = driver.findElement(By.xpath("//*[@class='pay']//h2"));
        Assertions.assertEquals(block.getText(), "Онлайн пополнение\n" +
                "без комиссии");
    }

    @Test
    public void logo() {
        WebElement visa = driver.findElement(By.cssSelector("img[src*=visa]"));
        WebElement visaVerified = driver.findElement(By.cssSelector("img[src*=visa-verified]"));
        WebElement mastercard = driver.findElement(By.cssSelector("img[src*=mastercard]"));
        WebElement mastercardSecure = driver.findElement(By.cssSelector("img[src*=mastercard-secure]"));
        WebElement belkart = driver.findElement(By.cssSelector("img[src*=belkart]"));
        System.out.println(" Логотип visa найден " + visa.isDisplayed() + " \n Логотип visa-verified найден " + visaVerified.isDisplayed()
                + " \n Логотип mastercard найден " + mastercard.isDisplayed() + " \n Логотип mastercard-secure найден " + mastercardSecure.isDisplayed()
                + "\n Логотип belkart найден " + belkart.isDisplayed());

    }

    @Test
    public void link() {
        driver.findElement(By.xpath("//*[text()='Подробнее о сервисе']")).click();
    }

    @Test
    public void keep() {
        driver.findElement(By.id("connection-phone")).sendKeys("297777777");
        driver.findElement(By.id("connection-sum")).sendKeys("200");
        driver.findElement(By.id("connection-email")).sendKeys("2334@fc.com");
        driver.findElement(By.xpath("//button[text()='Продолжить']")).click();

    }

}







