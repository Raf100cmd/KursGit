import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise8 {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
        driver = new ChromeDriver();  // inicjalizacja ChromeDrivera
    }

    @Test
    public void TestPrintNumberOfImagesAndLinksOnBBCPage() {
        List<WebElement> allImagesOnPage, allLinksOnPage;

        driver.get("https://www.bbc.com"); // uruchomienie strony https://www.bbc.com

        allImagesOnPage = driver.findElements(By.tagName("img")); // przypisanie obrazków (WebElementów <img>) do listy allImagesOnPage
        allLinksOnPage = driver.findElements(By.tagName("a")); // przypisanie linków (WebElementów <a>) do listy allLinksOnPage

        System.out.println("Ilość obrazków na stronie: " + allImagesOnPage.size()); // wypisanie w konsoli ilości obrazków na stronie
        System.out.println("Ilość linków na stronie: " + allLinksOnPage.size()); // wypisanie w konsoli ilości linków na stronie
    }

//    @After
//    public void tearDown() {
//        driver.close(); // zamknięcie przeglądarki
//    }
}
