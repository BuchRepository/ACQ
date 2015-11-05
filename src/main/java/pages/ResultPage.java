package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Администратор on 02.11.2015.
 */
public class ResultPage {
    private WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstLink (){
        driver.findElement(By.cssSelector(".lsb")).click();
        String result = driver.findElement(By.cssSelector(".r>a")).getText();

        return  result;
    }
}