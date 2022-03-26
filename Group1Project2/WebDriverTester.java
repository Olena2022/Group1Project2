package com.syntax.Group1Project2;

    class WebDriverTester {
        public static void main(String[] args) {
            RemoteWebDriver[] driver = {new ChromeDriver(), new FireFox(), new Safari()};
            for (RemoteWebDriver d : driver) {
                d.open();
                d.close();
                System.out.println(d.getTitle());
                d.navigate();
                d.getScreenshot();
            }
        }
    }

