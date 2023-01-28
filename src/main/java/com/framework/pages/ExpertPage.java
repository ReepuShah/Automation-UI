package com.framework.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.framework.generic.GenericHelper;

public class ExpertPage extends PageBase {

	
	private WebDriver driver;
	//WaitHelper wHelper = new WaitHelper(ObjectRepo.driver, null);
	

	public ExpertPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	/** Web Elements */
	
	@FindBy(xpath = "(//*[text()='Market Research'])[1]")
	@CacheLookup
	public WebElement  marketResearchAvatar;
	
	@FindBy(xpath = "(//*[text()='Product Support'])[1]")
	@CacheLookup
	public WebElement  productSupportAvatar;
	
	@FindBy(xpath = "(//*[text()='Regs and Policies'])[1]")
	@CacheLookup
	public WebElement RegsandPoliciesAvatar;
	
	
	
	
	
	

	
	
	
	
		
	
	
	
}
