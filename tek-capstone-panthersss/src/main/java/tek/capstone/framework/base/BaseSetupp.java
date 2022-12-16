package tek.capstone.framework.base;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import te.capstone.framework.config.Browser;
import te.capstone.framework.config.ChromeBrowser;
import te.capstone.framework.config.ChromeHeadless;
import te.capstone.framework.config.EdgeBrowser;
import te.capstone.framework.config.FireFoxBrowser;
import tek.capstone.framework.utilities.ReadYamlFiles;

public class BaseSetupp {

    private static WebDriver webDriver;
    private final ReadYamlFiles environmentVariables;
    public static Logger logger;

    public BaseSetupp() {
        String filePathh = System.getProperty("user.dir") + "/src/main/resources/cap_config.yml";
        String log4JPath = System.getProperty("user.dir") + "/src/main/resources/log4j.properties";

        try {
            environmentVariables = ReadYamlFiles.getInstance(filePathh);
        } catch (FileNotFoundException e) {
            System.out.println("Failed for Load environment context. check possible file path errors");
            throw new RuntimeException("Failed for Load environment context with message" + e.getMessage());

        }

        logger = logger.getLogger("logger.file");
        PropertyConfigurator.configure(log4JPath);

    }

    public WebDriver getDriver() {
        return webDriver;

    }

    public void setupBrowser() {
        HashMap uiproperties = environmentVariables.getYamlProperty("ui");
        System.out.println(uiproperties);
        String url = uiproperties.get("url").toString();
        Browser browser;
        switch (uiproperties.get("browser").toString().toLowerCase()) {
        case "chrome":
            if ((boolean) uiproperties.get("headless")) {
                browser = new ChromeHeadless();
            } else {
                browser = new ChromeBrowser();
            }
            webDriver = browser.openBrowser(url);
            break;
        case "firefox":
            browser = new FireFoxBrowser();
            webDriver = browser.openBrowser(url);
            break;
        case "edge":
            browser = new EdgeBrowser();
            webDriver = browser.openBrowser(url);
            break;
        default:
            throw new RuntimeException("Unknown Browser check environment properties");
        }

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));

    }

    public void quitBrowser() {
        if (webDriver != null)
            webDriver.quit();

    }
}
