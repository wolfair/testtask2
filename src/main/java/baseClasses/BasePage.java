package baseClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(){}

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 25);
    }

    public void findElement(By elementBy){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    public List<WebElement> getAllElementsByParam(By location, By elementsBy){
        findElement(location);
        return driver.findElement(location).findElements(elementsBy);
    }

    public WebElement getElementFromList(List<WebElement> listOfElements, String param, String paramValue){
        return listOfElements.stream()
                .filter(webElement -> !webElement.getAttribute(param).equals(paramValue))
                .findFirst()
                .orElse(null);
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void clickElementBy(By elementBy){
        findElement(elementBy);
        driver.findElement(elementBy).click();
    }

    public String readURL(By elementBy){
        findElement(elementBy);
        return driver.findElement(elementBy).getAttribute("url");
    }
}
