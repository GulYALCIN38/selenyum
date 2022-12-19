package day02_drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import java.time.Duration;
import java.util.List;

public class C02_WebElemntVeLocator {
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        //search bolumu locate et
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //search da iphon arat
        aramaKutusu.sendKeys("iphon", Keys.ENTER);
        /*
        EGER BIR WEB ELEMENTI (her bir buton veya yazi)LOCATE ETMEK ISTERSEK once manuel olarak web
        sayfasini acip sayfa uzerinde sag click yapip inceleye tiklariz. karsimiza cikan html kodlarindan locater(konum belirleyiciler)
         lardan essiz olani seceriz . Genellikle  id attributu kullanilir. ve sectigimiz attribute degeri findelement() methodu icine
        findelement(By.id("attribute degeri") yazilir

         */
        // amazon sayfasindaki input ve <a> tag sayisisni yazdir
        List<WebElement> inputtag = driver.findElements(By.tagName("input"));
        System.out.println(inputtag.size());

        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        System.out.println(linkler.size());

        for (WebElement w:linkler){
            System.out.println(w.getText());
        }
        driver.close();

    }
}
