import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

    public class zadanie7 {
        private WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
            driver = new ChromeDriver();  // inicjalizacja ChromeDrivera
        }

        @Test
        public void TestUnsuccessfulLoginToOrangeHRMPage() throws Exception {

            System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
            final String expectedMessage = "Invalid credentials"; // oczekiwana wiadomość po zalogowaniu niewłaściwymi danymi

            WebElement usernameInput, passwordInput, loginButton;
            String currentMessage;

            driver.get("https://opensource-demo.orangehrmlive.com/"); // uruchomienie strony https://opensource-demo.orangehrmlive.com

            usernameInput = driver.findElement(By.id("txtUsername"));
            passwordInput = driver.findElement(By.id("txtPassword"));
            loginButton = driver.findElement(By.id("btnLogin"));

            usernameInput.sendKeys("WrongUsername"); // w polu "Username" wpisz "WrongUsername"
            passwordInput.sendKeys("WrongPassword"); // w polu "Password" wpisz "WrongPassword"
            loginButton.click(); // kliknij przycisk "Login"

            currentMessage = driver.findElement(By.id("spanMessage")).getText(); // przypisanie do zmiennej currentMessage tekstu, który wyświetlił się w elemencie spanMessage

            assertEquals(expectedMessage, currentMessage); // sprawdzenie czy aktualny komunikat jest zgodny z oczekiwanym
        }
		
		
	}	