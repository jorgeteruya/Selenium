package Pagina;
import Pagina.Pagina;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuLateral {

    WebDriver driver = new ChromeDriver();
    public void MenuLateral(){
        driver.findElement(By.id("sidebay")).click();
    }
}
