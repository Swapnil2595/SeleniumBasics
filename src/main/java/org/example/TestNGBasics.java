package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestNGBasics extends Browser  {


    @Before
    public void LaunchBrowser() throws InterruptedException {
        Browser.OpenBrowser("https://www.google.com");
    }
@Test
    public void test() throws InterruptedException {

    }

    @After
    public void Close(){
        Browser.CloseBrowser();
    }

}
