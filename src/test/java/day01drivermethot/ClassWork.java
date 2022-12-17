package day01drivermethot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class ClassWork {
    /*
    Yeni bir package olusturalim : day01
Yeni bir class olusturalim : C03_GetMethods
Amazon sayfasina gidelim. https://www.amazon.com/
Sayfa basligini(title) yazdirin
Sayfa basliginin “Amazon” icerdigini test edin
Sayfa adresini(url) yazdirin
Sayfa url’inin “amazon” icerdigini test edin.
Sayfa handle degerini yazdirin
Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
Sayfayi kapatin.
     */
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver = new ChromeDriver();
        //   Yeni bir package olusturalim : day01
        //Yeni bir class olusturalim : C03_GetMethods

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfa basligini(title) yazdirin
        System.out.println("sayfa basligi "+driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String actuelTitle= driver.getTitle();
        if(actuelTitle.contains("Amazon")){
            System.out.println(" test de title est passed");

        }else{
            System.out.println("title de test est failed");
        }


        //Sayfa adresini(url) yazdirin
       // System.out.println(" url de page "+driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
      String actuelUrl= driver.getCurrentUrl();
        if(actuelUrl.contains("amazon")){
           System.out.println(" test de url est passed");

       }else{
            System.out.println("urel de test  est failed");
        }

        //Sayfa handle degerini yazdirin
        System.out.println("sayfa hamdle gegeri"+driver.getWindowHandle());
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actuelsayfakod= driver.getWindowHandle();
        if(actuelsayfakod.contains("gateway")){
            System.out.println(" test de HTML est passed");

        }else{
            System.out.println("HTML de test  est failed");
        }

        //Sayfayi kapatin.
        driver.close();







    }


}
