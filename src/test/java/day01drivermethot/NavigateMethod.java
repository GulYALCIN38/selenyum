package day01drivermethot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver = new ChromeDriver();
        //amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        //tecpro sayfasina gidelim
        driver.navigate().to("https://www.techproeducation.com");
        Thread.sleep(3000);
        //tekrar amazon sayfasina git
        driver.navigate().back();
        Thread.sleep(3000);
        // tecpro git
        driver.navigate().forward();
        Thread.sleep(3000);

         // sayfayi yenile
        driver.navigate().refresh();
        // sayfayi kapat
        driver.close();

        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        //Amazon soyfasina gidelim. https://www.amazon.com/
        //Tekrar YouTube’sayfasina donelim
        //Yeniden Amazon sayfasina gidelim
        //Sayfayi Refresh(yenile) yapalim
        //Sayfayi kapatalim / Tum sayfalari kapatalim

    }
}
