package DevOPS.devOPS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseDriver {

    public static WebDriver Chromedriver() {
        // No System.setProperty(...) — let Selenium Manager fetch the right driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--disable-gpu", "--window-size=1920,1080");
        // optional on Windows agents:
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        return new ChromeDriver(options);
    }
}
