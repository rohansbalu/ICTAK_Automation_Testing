package com.tech.ictak.scripts;

import org.apache.poi.ss.util.NumberToTextConverter;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tech.ictak.pages.LoginPageICTAK;
import com.tech.ictak.utilities.ExcelUtilityICTAK;
import com.tech.ictak.constants.AutomationConstantsICTAK;
import com.tech.ictak.pages.AddEmployeePageICTAK;
import com.tech.ictak.pages.EmployeeListPageICTAK;
import com.tech.ictak.pages.HomePageICTAK;



public class TestClassICTAK extends TestBaseICTAK {
	
	LoginPageICTAK objLogin;
	HomePageICTAK  objHome;
	AddEmployeePageICTAK objAddEmp;
	EmployeeListPageICTAK objEmpList;
	
	@Test(priority=0)
	  public void ValidLoginVerification() throws Exception {
	      
			objLogin=new LoginPageICTAK(getDriver());
		
	      String actualusername=ExcelUtilityICTAK.readDetails(1, 0).getStringCellValue();
	      objLogin.setUsername(actualusername);
	      Assert.assertEquals(AutomationConstantsICTAK.expusername, actualusername);
	      
	      String actualpassword=NumberToTextConverter.toText(ExcelUtilityICTAK.readDetails(1, 1).getNumericCellValue());
	      objLogin.setPassword(actualpassword);
	      Assert.assertEquals(AutomationConstantsICTAK.exppassword, actualpassword);
	      
	      objLogin.clickLogin();
	      String ActTitle=getDriver().getTitle();
	      Assert.assertEquals(AutomationConstantsICTAK.ExpTitle, ActTitle);
	      System.out.println(ActTitle);
	      
	  }
	
	
	@Test(priority=1)
	public void ValidHomeVerification() throws Exception{
		
		objHome=new HomePageICTAK(getDriver());
		
		objHome.openAddEmployee();
		
	}
	
	@Test(priority=2)
	public void ValidAddEmpVerification() throws Exception{
		
		
		objAddEmp=new AddEmployeePageICTAK(getDriver());
		
		String actualname=ExcelUtilityICTAK.readDetails(3, 0).getStringCellValue();
	    objAddEmp.setName(actualname);
	    Assert.assertEquals(AutomationConstantsICTAK.expname, actualname);
	    
	    String actualpwd=NumberToTextConverter.toText(ExcelUtilityICTAK.readDetails(3, 1).getNumericCellValue());
	    objAddEmp.setPassword(actualpwd);
	    Assert.assertEquals(AutomationConstantsICTAK.exppwd, actualpwd);
	    
	    String actualemail=ExcelUtilityICTAK.readDetails(3, 2).getStringCellValue();
	    objAddEmp.setEmail(actualemail);
	    Assert.assertEquals(AutomationConstantsICTAK.expemail, actualemail);
	    
	    String actualdes=ExcelUtilityICTAK.readDetails(3, 3).getStringCellValue();
	    objAddEmp.setDesignation(actualdes);
	    Assert.assertEquals(AutomationConstantsICTAK.expdesignation, actualdes);
	    
	    String actualrep=ExcelUtilityICTAK.readDetails(3, 4).getStringCellValue();
	    objAddEmp.setReporting(actualrep);
	    Assert.assertEquals(AutomationConstantsICTAK.expreporting, actualrep);
	    
	    String actualmember=ExcelUtilityICTAK.readDetails(3, 5).getStringCellValue();
	    objAddEmp.setMember(actualmember);
	    Assert.assertEquals(AutomationConstantsICTAK.expmember, actualmember);
	    
	    
	    String actualempid=NumberToTextConverter.toText(ExcelUtilityICTAK.readDetails(3, 6).getNumericCellValue());
	    objAddEmp.setEmployeeid(actualempid);
	    Assert.assertEquals(AutomationConstantsICTAK.expempid, actualempid);
	    
	    String actualconfirmpwd=NumberToTextConverter.toText(ExcelUtilityICTAK.readDetails(3, 7).getNumericCellValue());
	    objAddEmp.setConfirmpwd(actualconfirmpwd);
	    Assert.assertEquals(AutomationConstantsICTAK.expconfirmpwd, actualconfirmpwd);
	    
	    String actualmobileno=NumberToTextConverter.toText(ExcelUtilityICTAK.readDetails(3, 8).getNumericCellValue());
	    objAddEmp.setMobileno(actualmobileno);
	    Assert.assertEquals(AutomationConstantsICTAK.expmobileno, actualmobileno);
	    
	    String actualemptype=ExcelUtilityICTAK.readDetails(3, 9).getStringCellValue();
	    objAddEmp.setEmptype(actualemptype);
	    Assert.assertEquals(AutomationConstantsICTAK.expemptype, actualemptype);
	    
	    objAddEmp.selectCheckBox();
	    
	    String actualaddress=ExcelUtilityICTAK.readDetails(3, 10).getStringCellValue();
	    objAddEmp.setAddress(actualaddress);
	    Assert.assertEquals(AutomationConstantsICTAK.expaddress, actualaddress);
	    
	    objAddEmp.clickSubmit();
		
	}
	
	
	@Test(priority=3)
	public void ValidEmpListVerification() throws Exception{
		
		objEmpList=new EmployeeListPageICTAK(getDriver());
		
		objEmpList.openEmployeeList();
		
		objEmpList.clickEditbtn();
		
		objEmpList.openEmployeeList();
		
		objEmpList.clickDeletebtn();
	}
		  
	      
	  }
	  
	
	
	


