package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Selenium_Menager {
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.close();
        driver.quit();

        SeleniumManager.getInstance().getDriverPath("IEDriverServer");
        InternetExplorerDriver driver1 = new InternetExplorerDriver();
        driver1.get("https://www.amazon.com");
        //System.setProperty("webdriver.chrome.driver",)

      driver.getTitle();
    }
}
