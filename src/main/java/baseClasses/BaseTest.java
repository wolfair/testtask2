package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;

    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void teardown(){
        driver.quit();
    }
}
