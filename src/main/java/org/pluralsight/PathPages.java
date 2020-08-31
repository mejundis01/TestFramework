package org.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class PathPages {

    static String url = "https://www.pluralsight.com/tech-index";
    //static String title = "Pluralsight Technology Index";
    static String title = "Online Java Course: Java Language Fundamentals | Pluralsight";
    public void goTo() {
        Browser.driver.manage().window().maximize();
        Browser.goTo(url);
    }

   public PathPage getPathPage(String page) {
        switch (page) {
            case "Java Fundamentals: The Java Language":
                return Pages.javaPathPage();
        }
        return null;
   }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
