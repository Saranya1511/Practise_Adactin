package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class Login 
{

@Test
public void Case1() {
	System.setProperty("webdriver.chrome.driver","/Users/Saranya/Desktop/selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com");
    
	/*this is my first comment*/
	WebElement user1=driver.findElement(By.id("username"));
	user1.sendKeys("Saran4Harish");
	
	WebElement pass=driver.findElement(By.id("password"));
	pass.sendKeys("kanishka2!");
	
	driver.findElement(By.id("login")).click();
	
}
}

