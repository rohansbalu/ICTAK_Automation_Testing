package com.tech.ictak.pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.tech.ictak.utilities.PageUtilsICTAK;

public class AddEmployeePageICTAK {
	
	WebDriver driver;
	
	
	@FindBy(id="ContentPlaceHolder1_txtName")
	private WebElement name;
	
	@FindBy(id="ContentPlaceHolder1_txtPassword")
	private WebElement password;
	
	@FindBy(id="ContentPlaceHolder1_txtEmail")
	private WebElement email;
	
	@FindBy(id="ContentPlaceHolder1_drpDesignation")
	private WebElement designation;
	
	@FindBy(id="ContentPlaceHolder1_drpReportingTo")
	private WebElement reporting;
	
	@FindBy(id="ContentPlaceHolder1_drpGroup")
	private WebElement member;
	
	@FindBy(id="ContentPlaceHolder1_drpEmployeeType")
	private WebElement emptype;
	
	@FindBy(id="ContentPlaceHolder1_txtEmployeeId")
	private WebElement employeeid;
	
	@FindBy(id="ContentPlaceHolder1_txtConfirmPassword")
	private WebElement confirmpwd;
	
	@FindBy(id="ContentPlaceHolder1_txtMobileNumber")
	private WebElement mobileno;
	
	@FindBy(id="ContentPlaceHolder1_ChkReportingStaff")
	private WebElement checkbox;
	
	@FindBy(id="ContentPlaceHolder1_txtAddress")
	private WebElement address;
	
	@FindBy(id="ContentPlaceHolder1_btnSubmit")
	private WebElement submitbtn;
	
	@FindBy(id="Reset")
	private WebElement resetbtn;
	
	
	public AddEmployeePageICTAK(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void setName(String strname) {
    	
    	PageUtilsICTAK.sendInput(name, strname);
    }


	public void setPassword(String strpassword) {
	
		PageUtilsICTAK.sendInput(password, strpassword);
	}	
	
	public void setEmail(String stremail) {
	
		PageUtilsICTAK.sendInput(email, stremail);
	}
	
	public void setDesignation(String strdes) {
		
		PageUtilsICTAK.sendInput(designation, strdes);
	}
	
	public void setReporting(String strrep) {
		
		PageUtilsICTAK.sendInput(reporting, strrep);
	}
	
	public void setMember(String strmember) {
		
		PageUtilsICTAK.sendInput(member, strmember);
	}
	
	
	public void setEmployeeid(String stremployeeid) {
		
		PageUtilsICTAK.sendInput(employeeid, stremployeeid);
	}
	
	public void setConfirmpwd(String strconfirmpwd) {
		
		PageUtilsICTAK.sendInput(confirmpwd, strconfirmpwd);
	}
	
	public void setMobileno(String strmobileno) {
		
		PageUtilsICTAK.sendInput(mobileno, strmobileno);
	}
	
	public void setEmptype(String stremptype) {
		
		PageUtilsICTAK.sendInput(emptype, stremptype);
	}
	
	public void selectCheckBox() {
    	
    	PageUtilsICTAK.selectCheckBox(checkbox);
    }
	
	
	public void setAddress(String straddress) {
		
		PageUtilsICTAK.sendInput(address, straddress);
	}
	
	public void clickSubmit() {
        
		PageUtilsICTAK.clickele(driver, submitbtn);
	        
	}
	
	public void clickReset() {
        
		PageUtilsICTAK.reset(driver, resetbtn);
	        
	}
	
	
	
	
}