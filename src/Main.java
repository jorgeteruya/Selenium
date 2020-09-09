import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        //For windows
        //Driver path is required for selenium webdriver versions >3
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        Login login = new Login();
        login.fazerLogin();

        /*quit driver instance
        Closes chrome browser*/
        //driver.quit();

    }
}