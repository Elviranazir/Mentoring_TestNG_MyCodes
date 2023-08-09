package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class BaseDriver {
    public static WebDriver driver;
    static {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("incognito");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

}