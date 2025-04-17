
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MtsTest {
    private Arrears arrears;
    private CommunicationSerivices communicationSerivices;
    private HomeInternet homeInternet;
    private InstallmentPlan installmentPlan;
    private WebDriver driver;

    @BeforeMethod
    public void start() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        //new WebDriverWait(driver, Duration.ofSeconds(20)).
               // until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree"))).click();
        driver.manage().window().maximize();
        arrears = new Arrears(driver);
        communicationSerivices = new CommunicationSerivices(driver);
        homeInternet = new HomeInternet(driver);
        installmentPlan = new InstallmentPlan(driver);
    }

    @AfterMethod
    public void end() {
        driver.quit();
    }

   @org.testng.annotations.Test
    public void testCommunicationSerivices() throws InterruptedException {
        communicationSerivices.checkPhonenumber();
        communicationSerivices.checkSumLocator();
        communicationSerivices.checkEmailLocator();
        driver.findElement(By.id("connection-phone")).sendKeys("297777777");
        driver.findElement(By.id("connection-sum")).sendKeys("200");
        driver.findElement(By.id("connection-email")).sendKeys("2334@fc.com");
        driver.findElement(By.xpath("//button[text()='Продолжить']")).click();
        WebElement iframe = new WebDriverWait(driver, Duration.ofSeconds(40) )
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/iframe")));
        driver.switchTo().frame(iframe);
        WebElement headSum = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/div[1]/span"));
        System.out.println(headSum.getText());
        WebElement buttonSum = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/div[1]/span"));
        System.out.println(buttonSum.getText());
        WebElement numCard = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label"));
        System.out.println(numCard.getText());
        //WebElement numCard = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label"));
       // System.out.println();

    }

    @org.testng.annotations.Test
    public void testHomeInternet() {
        homeInternet.checkPhonenumber();
        homeInternet.checkSumLocator();
        homeInternet.checkEmailLocator();
    }

    @org.testng.annotations.Test
    public void testInstallmentPlan() {
        installmentPlan.checkAccountnumber();
        installmentPlan.checkSumLocator();
        installmentPlan.checkEmailLocator();
    }

    @org.testng.annotations.Test
    public void testArrears() {
        arrears.checkAccountnumber();
        arrears.checkSumLocator();
        arrears.checkEmailLocator();
    }
}

