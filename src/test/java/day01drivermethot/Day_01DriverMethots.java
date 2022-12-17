package day01drivermethot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Day_01DriverMethots {
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Sayfa basligi = "+driver.getTitle());
        System.out.println("sayfa urlsi = "+driver.getCurrentUrl());
       //System.out.println(driver.getPageSource()); SAYFANINKAYNAK HTML KODLARINI STRING OLARAK GETIRIR
        System.out.println(driver.getWindowHandle());//CDwindow-C5F2B9B5CD6395FA429337D66D4330CC
        //BU METHOT BIZE O WINDOW A AILT HASH DEGERI VERIR. BIZ BU DEGERLERI BIR STRINGE ATAYIP PENCERELER ARASI GECIS YAPABILIRIZ
        // SAYFA ICIMDE TIKLANARAK ACILACAK YENI PENCERELERE BU KODLA ULASIRIZ

    }
}
