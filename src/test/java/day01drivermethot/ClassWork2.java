package day01drivermethot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import java.time.Duration;

public class ClassWork2 {
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//bu methot  sayfadaki her bir
        // webeleemnt icin max bekleme suresini belirler

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actuelTitle= driver.getTitle();
        if(actuelTitle.contains("facebook")){
            System.out.println("title est passed");
        }else{
            System.out.println(" title test failled dogru baslik "+actuelTitle);
        }

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String url= driver.getCurrentUrl();
        if(url.contains("facebook")){
            System.out.println("url est passed");
        }else{
            System.out.println(" url test failled dogru url "+ url);
        }

        //https://www.walmart.com/ sayfasina gidin.

        driver.get("https://walmart.com");
        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actuelTitle1= driver.getTitle();
        if(actuelTitle1.contains("Walmart.com")){
            System.out.println("title est passed");
        }else{
            System.out.println(" title test failled dogru baslik "+actuelTitle1);
        }

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        // 9.Browser’i kapatin
        driver.close();
        //Collapse

    }
}
