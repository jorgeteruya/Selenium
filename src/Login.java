import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver = new ChromeDriver();

    public void fazerLogin(){
        WebElement search = driver.findElement(By.id("login-form:login"));
        search.sendKeys("jteruya");

        search.findElement(By.id("login-form:password1"));
        search.sendKeys("sw123456");

        search.findElement(By.className("ui-button-text ui-c"));
        search.click();

    }

}
