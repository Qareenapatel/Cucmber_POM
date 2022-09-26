package base_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	
	WebDriver driver;
	
		
	public Base(WebDriver driver) {
		this.driver = driver;
	}


	By Txt_username = By.xpath("//input[@id='user-name']");
	
	By Txt_password = By.xpath("//input[@id='password']");
	
	By loginbutton = By.xpath("//input[@id='login-button']");
	
	By reactbutton = By.xpath("//button[@id='react-burger-menu-btn']");
	
	By logout = By.xpath("//a[@id='logout_sidebar_link']");
	
	
	
	
	public void enterUsername(String uname) {
		driver.findElement(Txt_username).sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(Txt_password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(loginbutton).click();
	}
	
	public void clickOnReactButton() {
		driver.findElement(reactbutton).click();
	}
	
	public void clickOnLogout() {
		driver.findElement(logout).click();
	}
	
	
}


