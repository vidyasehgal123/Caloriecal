
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TC_Verify_Carbohydrate_Male {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "/Users/vidyasehgal/IdeaProjects/CalorieCalculator/chrome-mac-arm64");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/carbohydrate-calculator.html");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ageInput = driver.findElement(By.name("cage"));  // Find by 'name' attribute

        // Clear any pre-filled values (optional)
        ageInput.clear();

        // Enter age (e.g., 25 years)
        ageInput.sendKeys("66");
    }
}


