import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver = new ChromeDriver();

    public void fazerLogin(){
        Pagina pg = new Pagina();

        //ATENÇÃO para abrir ERP de teste marque como False,
        //caso contrario True irá para hanbiente de produção.
        //pg.URL_teste(false);

        driver.get("https://sws.sweda.com.br:8181/erp-mobox/");
        driver.findElement(By.name("login-form:login")).sendKeys("jteruya");
        driver.findElement(By.name("login-form:password1")).sendKeys("sw123456");
        driver.findElement(By.name("login-form:entrar")).click();

    }

}
