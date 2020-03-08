package com.hrms.testbase;
//SETTING UP OUR WEBDRIVER
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.hrms.utils.ConfigsReaderAsel;
import com.hrms.utils.Constants;
public class BaseClass {
	
    public static WebDriver driver;
           
    	public  static void setUp() {
    	//browser will be read from Properties file
    	ConfigsReaderAsel.readProperties(Constants.CONFIGS_FILEPATH);//reads entire file and initializes static variable prop
       // switch (Constants.BROWSER.toLowerCase()) {//browser is in constants file of in properties file
      
    	switch (ConfigsReaderAsel.getProperty("browser").toLowerCase()) { //trying to get property of browser, which equals to Chrome in Constants class
    	case "chrome":
            System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
            break;
        case "firefox":
            System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
            driver = new FirefoxDriver();
            break;
        default:
            System.err.println("Browser is not supported");
        }
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
       // driver.manage().window().maximize();
        //driver.get(Constants.HRMS_URL);//old version 
        driver.get(ConfigsReaderAsel.getProperty("url"));//opens URL
    }
    
        public static void tearDown() {
    	 	
        if (driver != null) {
            driver.quit();
        }
    }
}
