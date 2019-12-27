package com.CommonFun;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonFunctions {
	
	
	public Properties prop;
	public CommonFunctions() {
		try (InputStream input = new FileInputStream(System.getProperty("user.dir")+"/src/resources/prop.Properties")) {

            prop = new Properties();

            // load a properties file
            prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		
	}
	
			WebDriver driver;
			
			
		public WebDriver Driver() {
			
			try {
			System.out.println("path: "+System.getProperty("user.dir")+prop.getProperty("ChromeDriverPath"));
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+prop.getProperty("ChromeDriverPath"));
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disabled-infobars");
			options.addArguments("disabled-extensions");
			options.setExperimentalOption("useAutomationExtension", false);
			
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			System.out.println("Chrome launched successfully");
			//return driver;
			}
			
			catch(Exception e) {
				
				System.out.println("Exception message: "+e.getMessage());
			}
			return driver;
			
			
		}
	
	

}
