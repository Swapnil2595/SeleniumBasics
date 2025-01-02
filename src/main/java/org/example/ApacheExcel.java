package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

public class ApacheExcel extends Browser{


    public static void main(String[] args) throws Exception {

        File f = new File("C:\\Users\\Rushikesh\\IdeaProjects\\Selenium\\src\\test\\java\\New Microsoft Excel Worksheet.xlsx");
        FileInputStream file = new FileInputStream(f);
        XSSFWorkbook xs = new XSSFWorkbook(file);
        XSSFSheet sheet = xs.getSheetAt(0);
        String username = sheet.getRow(1).getCell(2).getStringCellValue();
        String password = sheet.getRow(1).getCell(3).getStringCellValue();
        System.out.println(username);
       // xs.close();
        Browser.OpenBrowser("https://www.instagram.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        SeleniumBasic.SendKeys(driver, By.xpath("//*[@id='name']"),username);
//
//        SeleniumBasic.ClickElement(driver,"//*[@id='email']");
//        String ot = SeleniumBasic.ReturnText("//*[@id='name']");
//        System.out.println(ot);
//        xs.close();
//        Browser.CloseBrowser();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='username']")));
        SeleniumBasic.ClickElement(driver,"//*[@name='username']");
        SeleniumBasic.SendKeys(driver, By.xpath("//*[@name='username']"),username);
        SeleniumBasic.ClickElement(driver,"//*[@name='password']");
        SeleniumBasic.SendKeys(driver, By.xpath("//*[@name='password']"),password);
        Thread.sleep(3000);
        SeleniumBasic.ClickElement(driver,"//*[text()='Log in']");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Not now']")));
        SeleniumBasic.ClickElement(driver,"//*[text()='Not now']");
        xs.close();
       Browser.CloseBrowser();
    }

}
