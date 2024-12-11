package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.TestContext;

public class Browser extends TestContext {


    Browser(WebDriver driver){
        this.driver = driver;
    }

    public void OpenBrowser(String url) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
       // this.driver =driver;
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get(url);
        driver.manage().window().fullscreen();
    }

    public static void CloseBrowser(){
        driver.quit();
    }
//    public static void main(String[] args) throws InterruptedException {
//        Browser.OpenBrowser("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
//    }
}
