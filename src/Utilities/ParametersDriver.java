package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParametersDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    @Parameters("browser")
    public static void generateDriver(String browserName){
        Logger logger=Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        if(browserName.equalsIgnoreCase("chrome")){
            ChromeOptions options=new ChromeOptions();
            options.addArguments("incognito");
            driver=new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("edge")) {
            EdgeOptions edgeOptions=new EdgeOptions();
            edgeOptions.addArguments("incognito");
            driver=new EdgeDriver(edgeOptions);
        }
        driver.manage().window().maximize();
        Duration duration=Duration.ofSeconds(20);
        driver.manage().timeouts().pageLoadTimeout(duration);
        driver.manage().timeouts().implicitlyWait(duration);
        wait=new WebDriverWait(driver,duration);
    }

    @AfterClass
    public static void quitDriver(){
        Parent.waitFunc(3);
        driver.quit();
    }

    public void closePreviousDrivers() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}