package org.example;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
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

        File f = new File("C:\\Users\\User\\OneDrive\\Desktop\\TestData.xlsx");
        FileInputStream file = new FileInputStream(f);
        XSSFWorkbook xs = new XSSFWorkbook(file);
        XSSFSheet sheet = xs.getSheetAt(0);


           int rowcount= sheet.getLastRowNum();
        int colcount = sheet.getRow(1).getLastCellNum();

        for(int i = 0;i<=rowcount;i++){

            XSSFRow row  = sheet.getRow(i);

            for(int j=0;j<colcount;j++){

                XSSFCell cell =row.getCell(j);

                switch (cell.getCellType()){
                    case STRING -> System.out.print(cell.getStringCellValue());
                    case NUMERIC -> System.out.print(cell.getNumericCellValue());
                    case BOOLEAN -> System.out.print(cell.getBooleanCellValue());
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

//        Browser.OpenBrowser("https://www.instagram.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        SeleniumBasic.SendKeys(driver, By.xpath("//*[@id='name']"),username);
//
//        SeleniumBasic.ClickElement(driver,"//*[@id='email']");
//        String ot = SeleniumBasic.ReturnText("//*[@id='name']");
//        System.out.println(ot);
//        xs.close();
//        Browser.CloseBrowser();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='username']")));
//        SeleniumBasic.ClickElement(driver,"//*[@name='username']");
//        SeleniumBasic.SendKeys(driver, By.xpath("//*[@name='username']"),username);
//        SeleniumBasic.ClickElement(driver,"//*[@name='password']");
//        SeleniumBasic.SendKeys(driver, By.xpath("//*[@name='password']"),password);
//        Thread.sleep(3000);
//        SeleniumBasic.ClickElement(driver,"//*[text()='Log in']");
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Not now']")));
//        SeleniumBasic.ClickElement(driver,"//*[text()='Not now']");
        xs.close();
   //    Browser.CloseBrowser();
    }

}
