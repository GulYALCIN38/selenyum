package day01drivermethot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import java.time.Duration;

public class Devoir {
    public static void main(String[] args) throws InterruptedException {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com");
        Thread.sleep(2000);
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        //Tekrar YouTube'sayfasina donelim
        driver.navigate().back();
        Thread.sleep(2000);
        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(2000);
        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(2000);
        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
    }

}
