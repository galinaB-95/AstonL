import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mts12 {
    @Test
    public void phoneNumber(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement element = driver.findElement(By.id("connection-phone"));
        System.out.println(element.getAttribute("placeholder"));
        Assertions.assertEquals("Номер телефона", element.getAttribute("placeholder"));
}
    @Test
    public void sum(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement element = driver.findElement(By.id("connection-sum"));
        System.out.println(element.getAttribute("placeholder"));
        Assertions.assertEquals("Сумма", element.getAttribute("placeholder"));
    }
    @Test
    public void emailLocator(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement element = driver.findElement(By.id("connection-email"));
        System.out.println(element.getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека", element.getAttribute("placeholder"));

    }

}
