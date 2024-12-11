package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.channels.SeekableByteChannel;

public class SeleniumBasic extends TestContext {


    public static void ClickElement(WebDriver driver,String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void SendKeys(WebDriver driver,By xpath,String keys){
        driver.findElement(xpath).sendKeys(keys);
    }

    public static boolean IsElementSelected(WebDriver driver,String xpath){
        boolean status = driver.findElement(By.xpath(xpath)).isSelected();
        return status;
    }

    public static void main(String[] args) throws InterruptedException {
        browser.OpenBrowser("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        SeleniumBasic.ClickElement(driver,"//*[@id='name']");
        SeleniumBasic.SendKeys(driver,By.xpath("//*[@id='name']"),"Swapnil");
        SeleniumBasic.SendKeys(driver,By.xpath("//*[@id='email']"),"Swapnil@xyz.com");
        SeleniumBasic.ClickElement(driver,"//*[@id='gender']");
        System.out.println(SeleniumBasic.IsElementSelected(driver,"//*[@id='gender']"));
        SeleniumBasic.ClickElement(driver,"//*[@id='mobile']");
        Thread.sleep(2000);
        SeleniumBasic.SendKeys(driver,By.xpath("//*[@id='mobile']"),"999999999");
        Thread.sleep(2000);
        Browser.CloseBrowser();



    }





}
