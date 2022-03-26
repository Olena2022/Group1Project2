package com.syntax.Group1Project2;

    public interface WebDriver {
        void open();
        void close();
        String getTitle();
    }
    interface TakesScreenShot{
        void getScreenshot();
    }
    interface RemoteWebDriver extends WebDriver, TakesScreenShot{
        void navigate();
    }
    class ChromeDriver implements RemoteWebDriver{

        @Override
        public void open() {
            System.out.println("Chrome Driver opens");
        }

        @Override
        public void close() {
            System.out.println("Chrome Driver close");
        }

        @Override
        public String getTitle() {

            return "Title ChromeDriver" ;
        }

        @Override
        public void navigate() {
            System.out.println("navigates to chrome driver");
        }

        @Override
        public void getScreenshot() {
            System.out.println("Chrome can take screenshots");
        }
    }
    class FireFox implements RemoteWebDriver{

        @Override
        public void open() {
            System.out.println("FireFox opens");
        }

        @Override
        public void close() {
            System.out.println("FireFox close");
        }

        @Override
        public String getTitle() {

            return "Title FireFox ";
        }

        @Override
        public void navigate() {
            System.out.println("navigates to FireFox");
        }

        @Override
        public void getScreenshot() {
            System.out.println("FireFox takes screenshots");
        }
    }
    class Safari implements RemoteWebDriver{

        @Override
        public void open() {
            System.out.println("opens Safari");
        }

        @Override
        public void close() {
            System.out.println("close Safari");
        }

        @Override
        public String getTitle() {

            return "Title Safari";
        }

        @Override
        public void navigate() {
            System.out.println("navigates to Safari");
        }

        @Override
        public void getScreenshot() {
            System.out.println("Safari takes screenshots");
        }
    }


