package day01drivermethot;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import java.time.Duration;

public class Devoir2 {
    public static void main(String[] args) throws InterruptedException {

        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());

        System.out.println(driver.manage().window().getSize());
        Thread.sleep(3000);
        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Point p=new Point(0,100);
        driver.manage().window().setPosition(p);

        Thread.sleep(3000);
        Dimension d=new Dimension(800,800);
       driver.manage().window().setSize(d);
       System.out.println(driver.manage().window().getPosition());

        System.out.println(driver.manage().window().getSize());

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin

        if(p.x==0&&p.y==100){
            System.out.println("posisyon testi passed");

        }else {
            System.out.println("posisyon testi failed");
        }

        if(d.width==800&&d.height==600){
            System.out.println("size testi passed");

        }else {
            System.out.println("size testi failed");
        }


        //Sayfayi kapatin
        driver.close();







    }
}
