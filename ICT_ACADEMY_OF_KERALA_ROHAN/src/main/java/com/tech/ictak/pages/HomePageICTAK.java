package com.tech.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.ictak.utilities.PageUtilsICTAK;

public class HomePageICTAK {

	WebDriver driver;
	
	@FindBy(linkText="Employee")
	private WebElement empLink;
	
	@FindBy(linkText="Add Employee")
	private WebElement addLink;
	
	@FindBy(linkText="List Employee")
	private WebElement listLink;
	
	
	public HomePageICTAK(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void openAddEmployee()
	{
		
		PageUtilsICTAK.hover(driver, empLink);
		PageUtilsICTAK.clickele(driver, addLink);
	}


}
