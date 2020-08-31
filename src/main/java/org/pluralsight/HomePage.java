package org.pluralsight;

public class HomePage {

        static String url = "https://www.pluralsight.com/tech-index";
        static String title = "Pluralsight Technology Index";

        public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
