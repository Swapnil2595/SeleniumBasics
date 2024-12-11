package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.lang.InterruptedException;
import java.nio.channels.SeekableByteChannel;
import java.util.List;

public class SeleniumBasic extends TestContext {


    private WebElement Fname = driver.findElement(By.xpath("//*[@id='name']"));
    private WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
    private WebElement gender = driver.findElement(By.xpath("//*[@id='gender']"));
    private WebElement num = driver.findElement(By.xpath("//*[@id='mobile']"));
    private WebElement DOB = driver.findElement(By.id("dob"));
    private WebElement Subjects = driver.findElement(By.id("subjects"));
    private WebElement DropDown = driver.findElement(By.id("city"));
  //  private WebElement chechk = driver.findElement(By.xpath("(//input[@type='checkbox'])["+name+"]"));

   // private static WebElement CheckBox = driver.findElement(By.xpath(xpath));

    SeleniumBasic(WebDriver driver){
        this.driver = driver;

    }

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

    public static void ClickCheckboxByname (WebDriver driver,String name){

         WebElement chechk = driver.findElement(By.xpath("(//input[@type='checkbox'])["+name+"]"));
         chechk.click();
    }

    public static WebElement ReturnElement(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    public static void main(String[] args) throws InterruptedException {

        Browser.OpenBrowser("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        SeleniumBasic.ClickElement(driver,"//*[@id='name']");
        SeleniumBasic.SendKeys(driver,By.xpath("//*[@id='name']"),"Swapnil");
        SeleniumBasic.SendKeys(driver,By.xpath("//*[@id='email']"),"Swapnil@xyz.com");
        SeleniumBasic.ClickElement(driver,"//*[@id='gender']");
        System.out.println(SeleniumBasic.IsElementSelected(driver,"//*[@id='gender']"));
        SeleniumBasic.ClickElement(driver,"//*[@id='mobile']");
        Thread.sleep(2000);
        SeleniumBasic.SendKeys(driver,By.xpath("//*[@id='mobile']"),"999999999");
        Thread.sleep(2000);
        SeleniumBasic.SendKeys(driver,By.xpath("//*[@id='dob']"),"25011995");
        Thread.sleep(2000);
        SeleniumBasic.SendKeys(driver,By.id("subjects"),"Maths");
        Thread.sleep(2000);
        SeleniumBasic.ClickCheckboxByname(driver,"1");
        Thread.sleep(2000);
        SeleniumBasic.ClickCheckboxByname(driver,"2");
        Thread.sleep(2000);
        SeleniumBasic.ClickCheckboxByname(driver,"3");
        Thread.sleep(2000);
        System.out.println(SeleniumBasic.IsElementSelected(driver,"(//input[@type='checkbox'])[1]"));
        System.out.println(SeleniumBasic.IsElementSelected(driver,"(//input[@type='checkbox'])[2]"));
        System.out.println(SeleniumBasic.IsElementSelected(driver,"(//input[@type='checkbox'])[3]"));

        WebElement DropDown = driver.findElement(By.id("city"));
        //DropDown.click();
        Thread.sleep(2000);
        Select s = new Select(DropDown);
        Thread.sleep(2000);
        List<WebElement> list = s.getOptions();
        for(WebElement e:list){
        System.out.println(e.getText());}


        WebElement SDropDown = driver.findElement(By.id("state"));
        SDropDown.click();
        Thread.sleep(2000);
        s = new Select(SDropDown);
        List<WebElement>l2=s.getOptions();
        for(WebElement e:l2){
            System.out.println(e.getText());}

        Browser.CloseBrowser();



    }





}
