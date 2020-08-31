package org.pluralsight;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void canGoToHomePage() {
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
    }

    @Test
    public void canGoToJavaPathPage() {
        Pages.pathPages().goTo();
        PathPage pathPage = Pages.pathPages().getPathPage("Java Fundamentals: The Java Language");
        pathPage.goTo();
        Assert.assertTrue(pathPage.isAtPathPage("Java Fundamentals: The Java Language"));
    }
    @AfterClass
    public static void cleanUp() {
       Browser.close();
    }
}
