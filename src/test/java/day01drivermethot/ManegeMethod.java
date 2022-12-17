package day01drivermethot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class ManegeMethod {
    public static void main(String[] args) throws InterruptedException {

        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver = new ChromeDriver();
        //Amazon soyfasina gidelim. https://www.amazon.com/

        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfanin konumu"+driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari"+driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("sayfanin konumu"+driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari"+driver.manage().window().getSize());
        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("sayfanin konumu"+driver.manage().window().getPosition());
        System.out.println("sayfanin boyutlari"+driver.manage().window().getSize());
        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
        //Collapse

    }
}
