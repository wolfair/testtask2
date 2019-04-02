package pages;

import baseClasses.BasePage;
import baseClasses.TabMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    public String url = "https://comaqa.by";
    TabMenu aboutUsButton = new TabMenu() {
        @Override
        public By tabNav() {
            return By.xpath("//a[contains(text(),'About us')]");
        }
    };
    public HomePage goToHP(){
        driver.get(url);
        return this;
    }

    public AboutUsPage goToAUP(){
        this.clickElementBy(aboutUsButton.tabNav());
        return new AboutUsPage(driver);
    }
}
