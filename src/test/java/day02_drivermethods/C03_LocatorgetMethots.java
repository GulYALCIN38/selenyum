package day02_drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import java.time.Duration;

public class C03_LocatorgetMethots {
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");
        //search bolumunu locate edip , iphone aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphon", Keys.ENTER);
        //ARAMA SONUC YAZISINDA IPHON YAZISINI LOCATE EDIP  KONSOLA YAZDIRIN
        WebElement aramasonucYazisi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramasonucYazisi.getText());


        //SAYFAYI KAPATIN
        driver.close();
    }
}
