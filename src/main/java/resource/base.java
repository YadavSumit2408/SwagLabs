package resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {
    public WebDriver driver;
    public Properties prop;
    public WebDriver initializeDriver() throws IOException
    {

        prop= new Properties();
        FileInputStream fis=new FileInputStream("src/main/java/resource/data.properties");

        prop.load(fis);
        String browserName=prop.getProperty("browser");
        System.out.println(browserName);

        if(browserName.equals("edge"))
        {
            System.setProperty("webdriver.edge.driver",
                    "C:\\Users\\sumityad\\eclipse-workspace\\SwagLabs\\src\\main\\resources\\msedgedriver.exe");

            driver = new EdgeDriver();

            //execute in chrome driver

        }

        else if (browserName.equals("firefox"))
        {
            driver= new FirefoxDriver();
            //firefox code
        }
        else if (browserName.equals("IE"))
        {
//	IE code
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;


    }
}
