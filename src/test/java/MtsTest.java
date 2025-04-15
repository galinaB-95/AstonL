import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MtsTest {
    private Arrears arrears;
    private CommunicationSerivices communicationSerivices;
    private HomeInternet homeInternet;
    private InstallmentPlan installmentPlan;
    private WebDriver driver;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree"))).click();
        driver.manage().window().maximize();
        arrears = new Arrears(driver);
        communicationSerivices = new CommunicationSerivices(driver);
        homeInternet = new HomeInternet(driver);
        installmentPlan = new InstallmentPlan(driver);
    }

    @AfterEach
    public void end() {
        driver.quit();
    }

    @Test
    public void testCommunicationSerivices() {
        communicationSerivices.checkPhonenumber();
        communicationSerivices.checkSumLocator();
        communicationSerivices.checkEmailLocator();
        driver.findElement(By.id("connection-phone")).sendKeys("297777777");
        driver.findElement(By.id("connection-sum")).sendKeys("200");
        driver.findElement(By.id("connection-email")).sendKeys("2334@fc.com");
        driver.findElement(By.xpath("//button[text()='Продолжить']")).click();
        WebElement headSum = driver.findElement(By.xpath("//button[text()=' Оплатить 200.00 BYN']")); //html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button"));
        //WebElement headSum = driver.findElement(By.cssSelector( "div.pay-description__cost"));
        System.out.println(headSum.getText());
    }

    @Test
    public void testHomeInternet() {
        homeInternet.checkPhonenumber();
        homeInternet.checkSumLocator();
        homeInternet.checkEmailLocator();
    }

    @Test
    public void testInstallmentPlan() {
        installmentPlan.checkAccountnumber();
        installmentPlan.checkSumLocator();
        installmentPlan.checkEmailLocator();
    }

    @Test
    public void testArrears() {
        arrears.checkAccountnumber();
        arrears.checkSumLocator();
        arrears.checkEmailLocator();
    }
}
