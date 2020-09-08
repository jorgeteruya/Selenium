
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteMedium {
    public static void main(String[] args) throws InterruptedException {
        //For windows
        //Driver path is required for selenium webdriver versions > 3
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\chromedriver.exe");

        //initialize chrome driver instance
        WebDriver driver = new ChromeDriver();

        //start a new chrome browser
        driver.get("https://www.google.com");

        //finding the element and and enter text in the element
        driver.findElement(By.cssSelector(".gsfi#lst-ib")).sendKeys("Hurray!");

        Thread.sleep(3000);
        //Alternatively you can find the element and store it in a variable perform multiple actions
        WebElement search = driver.findElement(By.className("hp"));
        //clicking on the google search element
        search.click();

        //quit driver instance
        //Closes chrome browser
        driver.quit();

    }
}