package com.tech.ictak.pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.ictak.utilities.PageUtilsICTAK;





public class LoginPageICTAK {
	
	WebDriver driver;
	
	 @FindBy(xpath="//input[@id='txtUsername']")
	    private WebElement username;
	 
	 @FindBy(xpath="//input[@id='txtPassword']")
	    private WebElement password;
	 
	 
	 @FindBy(xpath="//input[@name='btnSubmit']")
	    private WebElement login;
	 

	 
	 
	 
	 
	 
	
	 
	 
	 
	 public LoginPageICTAK(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	 public void setUsername(String uname) throws Exception {
         PageUtilsICTAK.sendInput(username, uname);
        
         }
	 
	 public void setPassword(String lock) throws Exception {
         PageUtilsICTAK.sendInput(password, lock);
        
         }
	 
	 public void clickLogin() throws Exception {
    	 PageUtilsICTAK.clickele(driver,login);
    	 
     }
	 
	 

	 
	 
	 
	 
	 
	 

}
