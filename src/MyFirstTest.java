import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {
    public static void main(String[] args) {

        //For windows
        //Driver path is required for selenium webdriver versions >3
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        //initialize chrome driver instance
        WebDriver driver = new ChromeDriver();

        //start a new chrome browser
        Pagina pg = new Pagina();

        //ATENÇÃO para abrir ERP de teste marque como False,
        //caso contrario True irá para hanbiente de produção.
        pg.URL_teste(true);

//        Login login = new Login();
//        login.fazerLogin();

        /*quit driver instance
        Closes chrome browser*/
        //driver.quit();

    }
}