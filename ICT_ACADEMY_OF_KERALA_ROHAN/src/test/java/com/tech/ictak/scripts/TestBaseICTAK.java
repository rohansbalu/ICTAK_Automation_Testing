package com.tech.ictak.scripts;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestBaseICTAK {
	
	private WebDriver driver;
	public static Properties properties;
	
	@BeforeTest
	public void onSetUp() throws Exception {
		properties=new Properties();
		FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
        properties.load(new InputStreamReader(inputStream));
        
        if(properties.getProperty("browser").equals("chrome")) {
            setDriver(new ChromeDriver());
        }
        else if(properties.getProperty("browser").equals("firefox")) {
            setDriver(new FirefoxDriver());
        }
        else if(properties.getProperty("browser").equals("edge")) {
            setDriver(new EdgeDriver());
        }
      
        getDriver().get(properties.getProperty("url"));
        getDriver().manage().window().maximize();
       
	}
	public WebDriver getDriver() {
        
        return driver;
        
    }
    public void setDriver(WebDriver driver) {
        
        this.driver = driver;
    }


}
