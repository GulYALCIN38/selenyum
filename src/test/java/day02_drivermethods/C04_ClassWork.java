package day02_drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import java.time.Duration;

public class C04_ClassWork {
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramasonucYazisi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramasonucYazisi.getText());
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        driver.close();

    }
}
