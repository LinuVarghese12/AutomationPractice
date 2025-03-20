package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BasePage {
	
WebDriver driver;

public BasePage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
    //this.driver=driver;
	
	
}


}
