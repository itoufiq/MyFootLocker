package utilities;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver dr;
	
	@BeforeMethod 
	public void openBrowser() throws Exception {
		Properties propFile = ReadPropertiesFiles.readConfigFile("C:\\Users\\Iftekher\\My Workspace\\"
				+ "MyFootLocker\\config.properties");
		String browser = propFile.getProperty("browser");
		if (browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Iftekher\\Desktop\\"
					+ "BitTech Files 0012\\driver\\chromedriver.exe");
			dr=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.geckodriver.driver", "\"C:\\Users\\Iftekher\\Desktop\\"
					+ "BitTech Files 0012\\driver\\geckodriver.exe\"");
			dr=new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("InternetExplorer")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Iftekher\\"
					+ "Desktop\\BitTech Files 0012\\driver\\IEDriverServer.exe\"");
			dr=new InternetExplorerDriver();
		
	}
		else {
			System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\Iftekher\\"
					+ "Desktop\\BitTech Files 0012\\driver\\IEDriverServer.exe\"");
			dr=new SafariDriver();
	
}
		dr.get(propFile.getProperty("url"));
	}
}
