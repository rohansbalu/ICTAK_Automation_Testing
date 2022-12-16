package com.tech.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.ictak.utilities.PageUtilsICTAK;

public class EmployeeListPageICTAK {
	
	WebDriver driver;
	
	@FindBy(linkText="Employee")
	private WebElement empLink;
	
	@FindBy(linkText="List Employee")
	private WebElement listLink;
	
	@FindBy(linkText="Edit")
	private WebElement editbtn; 
	
	@FindBy(linkText="Delete")
	private WebElement deletebtn; 
	
	public EmployeeListPageICTAK(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void openEmployeeList()
	{
		
		PageUtilsICTAK.hover(driver,empLink);
		PageUtilsICTAK.clickele(driver, listLink);
	}
	
	public void clickEditbtn()
	{
		
		PageUtilsICTAK.enterKeyEg(driver);
		PageUtilsICTAK.clickele(driver, editbtn);
		
	}
	
	public void clickDeletebtn()
	{
		
		PageUtilsICTAK.enterKeyEg(driver);
		PageUtilsICTAK.clickele(driver, deletebtn);
		PageUtilsICTAK.alertEg(driver);
	}

}
