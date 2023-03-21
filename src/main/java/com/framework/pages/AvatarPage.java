package com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/*******************************************************************************************************
* @author  Vikas Sangwan
* @since   2016-04-15
********************************************************************************************************/

public class AvatarPage extends PageBase {
	private WebDriver driver;
	public AvatarPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	/** Web Elements */
	
	@FindBy(xpath = "//*[text()=' Create Avatar']")
	@CacheLookup
	public  WebElement createAvatarButton;
	
	@FindBy(xpath = "(//*[@class='Icon_icon__DouW- Icon_icon-dots__j3MZJ EntityCard_menuTrigger__FbNGS Icon_clickable__zx4Rp'])[1]")
	@CacheLookup
	public  WebElement threeDot;
	
	@FindBy(xpath = "//*[text()='Edit']")
	@CacheLookup
	public  WebElement editOption;
	
	@FindBy(xpath = "(//*[@class='Button-root_root__1sB-5 Button-variant_contained__fe7h- Button-color_primary__qB7yo Button-size_large__EoHFJ'])[2]")
	@CacheLookup
	public  WebElement runDomainAdaptationButton;
	
	
	
	
	



}
