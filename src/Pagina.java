import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagina {
    boolean link_producao;
    public void URL_teste(boolean link_producao){
        WebDriver driver = new ChromeDriver();

        this.link_producao = link_producao;
        if(link_producao == true){
            driver.get("https://sws.sweda.com.br/erp-mobox/");
        }else {
            driver.get("https://sws.sweda.com.br:8181/erp-mobox/");
        }
    }
}
