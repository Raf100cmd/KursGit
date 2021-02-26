import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie6a {

    static WebDriver driver;

    // Test 1 LOGOWANIE DO SYSTEMU - poprawne logowanie
    @Test
    public void logowanieDoSystemu (){

        System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        //  driver.get("https://opensource-demo.orangehrmlive.com/"); - druga opcja wyświetlania strony
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        WebElement inputUsername  = driver.findElement(By.id("txtUsername"));
        inputUsername.sendKeys("Admin");

        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();

        Assertions.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard",
                driver.getCurrentUrl());
        System.out.println("test 1");
    }
}