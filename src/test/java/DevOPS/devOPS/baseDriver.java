import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseDriver {
    public static WebDriver Chromedriver() {
        // 1) REMOVE the System.setProperty line
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--disable-gpu", "--window-size=1920,1080");
        // optional on Windows builders:
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");

        // 2) This will trigger Selenium Manager to download the matching driver
        return new ChromeDriver(options);
    }
}
