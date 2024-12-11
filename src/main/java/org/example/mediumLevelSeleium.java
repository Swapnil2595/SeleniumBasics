package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class mediumLevelSeleium extends TestContext{

    public static void main(String[] args) throws InterruptedException {
        Browser.OpenBrowser("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
     //   driver.manage().window().fullscreen();
//        WebElement FileUpload = driver.findElement(By.xpath("//input[@type='file']"));
//        String path = "C:\\Users\\Rushikesh\\OneDrive\\Desktop\\Swapnil\\IMG_3622-min.jpeg";
//       // FileUpload.click();
//        Thread.sleep(3000);
//        FileUpload.sendKeys(path);
//        Thread.sleep(2000);
//        Browser.CloseBrowser();

      //  WebElement Alert1 = driver.findElement(By.xpath("//*[text()='Alert']"));
      //  WebElement Alert2 = driver.findElement(By.xpath("//*[@onclick='myPromp()']"));
//        Alert1.click();
//        Alert a = driver.switchTo().alert();
//        Thread.sleep(2000);
//        String text = a.getText();
//        Thread.sleep(2000);
//        System.out.println(text);
//        Thread.sleep(2000);
//        a.accept();

//        Alert2.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = driver.switchTo().alert();
//        Thread.sleep(2000);
//        String t = alert.getText();
//        Thread.sleep(2000);
//        System.out.println(t);
//        //alert.accept();
//      //  alert.dismiss();
//        alert.sendKeys("Swapnil");
//        System.out.println("Text sent tp prompt");
//        Thread.sleep(4000);
//        alert.accept();
//        Browser.CloseBrowser();
        String parentid =driver.getWindowHandle();
        System.out.println(parentid);

        WebElement window = driver.findElement(By.xpath("//*[@title='New Tab']"));
        Thread.sleep(2000);
        window.click();





    }
}
