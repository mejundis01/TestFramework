package org.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JavaPathPage extends PathPage{

    @FindBy(how = How.CSS, using = "#course-page-hero>div>div>div>div>div.title.section>h1")
    WebElement pageElement;

    @Override
    public void goTo() {
        WebElement javaLink = Browser.driver.findElement (By.xpath("//div[normalize-space()='Java']"));
        JavascriptExecutor executor = (JavascriptExecutor)Browser.driver;
        executor.executeScript("arguments[0].click();", javaLink);
        WebElement javaCourse = Browser.driver.findElement(By.xpath("//div[normalize-space()='Java Fundamentals: The Java Language']"));
        JavascriptExecutor execute = (JavascriptExecutor)Browser.driver;
        execute.executeScript("arguments[0].click();", javaCourse);
    }

    @Override
    public String pathName() {
        return pageElement.getText();
    }
}
