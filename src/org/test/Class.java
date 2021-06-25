package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jp759\\eclipse-workspace\\SeleniumProjectOne\\Drivers\\chromedriver.exe");
	WebDriver s=new ChromeDriver();
	s.manage().window().maximize();
		
	s.get("https://en-gb.facebook.com/");
	
	String currentUrl = s.getCurrentUrl();
	System.out.println(currentUrl);
	
	String title = s.getTitle();
	System.out.println(title);
	WebElement n= s.findElement(By.id("email"));
			n.sendKeys("pnk");
	s.findElement(By.id("pass")).sendKeys("123456");
	

	}
	}
