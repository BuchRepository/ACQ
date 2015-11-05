package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Администратор on 02.11.2015.
 */
public class GooglePage  {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultPage search (String text){

        driver.findElement(By.id("lst-ib")).sendKeys(text);
        return  new ResultPage (driver);
    }
}
