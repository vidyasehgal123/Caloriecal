
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.time.Duration;

public class TC_Verify_Carbohydrate_Male {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "/Users/vidyasehgal/IdeaProjects/CalorieCalculator/chrome-mac-arm64");
        // Set the path to your chromedriver (adjust the path accordingly)
        // System.setProperty("webdriver.chrome.driver", "");

        // Initialize the WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();
        // URL page Opening
        driver.get("https://www.calculator.net/carbohydrate-calculator.html");

        // Wait time
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement ageInput = driver.findElement(By.id("cage"));
        ageInput.clear();
        ageInput.sendKeys("30");

        WebElement heightInput = driver.findElement(By.id("cheightmeter"));
        heightInput.clear();  // Clear any pre-filled value
        heightInput.sendKeys("175");

        WebElement WeightInput = driver.findElement(By.id("ckg"));
        WeightInput.clear();  // Clear any pre-filled value
        WeightInput.sendKeys("77");


       WebElement Button=driver.findElement(By.xpath("//input[@value='Calculate']"));
       Button.click();

       driver.close();

    }
}
