package com.tech.ictak.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class PageUtilsICTAK {
	
	public static void sendInput(WebElement ele,String input) {
		
		ele.clear();
		ele.sendKeys(input);
		
	}
	
	public static void clickele(WebDriver driver,WebElement ele) {
		WaitUtilityICTAK.waitForElementToBeClickable(driver,ele);
		ele.click();
	}
	
	public static void scrollTillEle(WebDriver driver,WebElement ele) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele);
		
	}
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,000)", "");
	}
	
	public static String getTextt(WebElement ele) {
		return ele.getText();
	}
	
	public static boolean isDisplayedd(WebElement ele) {
		
		return ele.isDisplayed();
	}
	
	public static void selectCheckBox(WebElement ele) {
		if(!ele.isSelected()) {
			ele.click();
		}
	}
	
	public static void actionClick(WebElement ele,WebDriver driver) {
		Actions action=new Actions( driver);
		action.moveToElement(ele).click().build().perform();
		
		

}
	
	public static void doubleClickk(WebElement ele,WebDriver driver) {
		Actions action=new Actions( driver);
		action.doubleClick(ele).click().build().perform();
		
	}
	
	public static void rightClick(WebElement ele,WebDriver driver) {
		Actions action=new Actions( driver);
		action.contextClick(ele).click().build().perform();
		
	}
	
	public static void hover(WebDriver driver,WebElement ele) {
		Actions action=new Actions( driver);
		action.moveToElement(ele).build().perform();

		
	}
	
	public static void enterKey(WebDriver driver) {
		Actions action=new Actions( driver);
		action.sendKeys(Keys.ENTER);
	}
	
	public static void multipleKey(WebDriver driver) {
		Actions action=new Actions( driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
	}
	
	public static void reset(WebDriver driver, WebElement element)
    {
       
        element.clear();
    }
	
	 public static void enterKeyEg(WebDriver driver)
	    {
	    	
	    	Actions action=new Actions(driver);
	    	action.sendKeys(Keys.ARROW_DOWN);
	    	action.sendKeys(Keys.ENTER);
	    }
	    
	    public static void alertEg(WebDriver driver)
	    {
	    	Alert alert=driver.switchTo().alert();
	    	alert.accept();
	    }

	
	
	

}
