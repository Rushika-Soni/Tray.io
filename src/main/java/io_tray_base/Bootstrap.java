package io_tray_base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io_tray_util.TestUtil;


public class Bootstrap {

	public static WebDriver driver;
	public static String URL = "https://tray.io";
	public static String BrowserName = "chrome";

	public static void initialisation() {
		if(BrowserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/Prishasoni/Downloads/chromedriver");
			driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "/Users/Prishasoni/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		driver.get(URL);
	}

}

