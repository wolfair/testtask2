package pages;

import baseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUsPage extends BasePage {
    public AboutUsPage(WebDriver driver){
        super(driver);
    }

    public String url = "https://comaqa.by/en/about-us-en/";
    public By listOfURLs = By.xpath("//a");
    public By pageBody = By.id("site-body");
}
