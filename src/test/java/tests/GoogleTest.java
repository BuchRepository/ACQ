package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GooglePage;
import pages.ResultPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by Администратор on 02.11.2015.
 */
public class GoogleTest {
    WebDriver driver = new FirefoxDriver();

    @Before
    public void setPage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com.ua");
    }

    @After
    public  void endpage(){
        driver.close();
    }

    @Test
    public void start () {
        GooglePage page = new GooglePage(driver);
        ResultPage result = page.search("automated test");
        assertTrue(result.getFirstLink().contains("automated"));
    }
}
