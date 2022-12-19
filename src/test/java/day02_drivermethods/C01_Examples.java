package day02_drivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import java.time.Duration;

public class C01_Examples {
   static WebDriver driver;
    /*
    ilk once browser i maximizse yap sonra tum sf icin max bekleme suresi olarak 15 sn belirt
    sirasiyla amzon face book ve yootube sayfalarinea git
    Amazon a tekrar don
    Amazon sayfasinin Url inin  https://www.amazon.com/ a esit oldugunu test edelim
    sfnin konum ve pozisyonu yazdir
    sf nin konum ve size ini istedigimiz sekilde ayarlayalim ve istedigimiz sekilde oldugunu test edelim
     sayfayi kapat

     */
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        driver=new ChromeDriver();


        // ilk once browser i maximizse yap sonra tum sf icin max bekleme suresi olarak 15 sn belirt
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //    sirasiyla amzon face book ve yootube sayfalarinea git
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");
        //    Amazon a tekrar don
        driver.navigate().back();
        driver.navigate().back();
        //    Amazon sayfasinin Url inin  https://www.amazon.com/ a esit oldugunu test edelim
        String actuelUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        if(actuelUrl.equals(expectedUrl)){
            System.out.println( "Test url passed");
        }else{
            System.out.println("test url failed");
        }
        //    sfnin konum ve pozisyonu yazdir
        System.out.println("sayfanin boyutu "+driver.manage().window().getSize());
        System.out.println("sayfanin konumu "+driver.manage().window().getPosition());
        //    sf nin konum ve size ini istedigimiz sekilde ayarlayalim ve
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("sayfanin YENI boyutu "+driver.manage().window().getSize());
        System.out.println("sayfanin YENI konumu "+driver.manage().window().getPosition());

        //istedigimiz sekilde oldugunu test edelim
        Dimension actuelsizeyeni=driver.manage().window().getSize();
        if(actuelsizeyeni.getWidth()==600&&actuelsizeyeni.getHeight()==600){
            System.out.println("size test passed");
        }else {
            System.out.println("size testi failed");
        }
        Point actuelYeniKonum=driver.manage().window().getPosition();
        if(actuelYeniKonum.getX()==50&&actuelYeniKonum.getY()==50){
            System.out.println("konum test passed");
        }else {
            System.out.println("konum testi failed");
        }

        //     sayfayi kapat
        driver.close();
    }
}
