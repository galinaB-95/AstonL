import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    @Test
    public void init() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        Assertions.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")).getText(),"Онлайн пополнение\n" +
                "без комиссии" );
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")).getText();

    }
}

