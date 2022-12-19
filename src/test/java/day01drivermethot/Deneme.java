package day01drivermethot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Deneme {
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
Sayfayi kapatin.*/
     public static void main(String[] args) {
         SeleniumManager.getInstance().getDriverPath("chromedriver");
         ChromeDriver driver=new ChromeDriver();
         driver.get("https://www.amazon.com");
         System.out.println(driver.getTitle());
          String s=driver.getTitle();
          if(s.contains("Amazon")){
              System.out.println("passed");
          }else{
              System.out.println("failed");
          }
         System.out.println(driver.getCurrentUrl());
          String s1=driver.getCurrentUrl();

         if(s1.contains("amazon")){
             System.out.println(" url passed");
         }else{
             System.out.println(" url failed");
         }
         System.out.println(driver.getWindowHandle());

     }

}
