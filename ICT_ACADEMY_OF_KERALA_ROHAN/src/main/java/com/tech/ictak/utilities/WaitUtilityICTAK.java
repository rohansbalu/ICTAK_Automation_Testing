package com.tech.ictak.utilities;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tech.ictak.constants.AutomationConstantsICTAK;



public class WaitUtilityICTAK {
	
	public static void waitForElementToBeClickable(WebDriver driver, WebElement target) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(AutomationConstantsICTAK.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(target));
    }
    
    public static void waitForEle(WebDriver driver, WebElement target) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(AutomationConstantsICTAK.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.visibilityOf(target));
    }
	
	

}
