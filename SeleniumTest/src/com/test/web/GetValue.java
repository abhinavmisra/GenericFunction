package com.test.web;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class GetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://toolsqa.com/automation-practice-form/");
		//driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement selectElement = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select ref = new Select(selectElement);
		//ref.selectByValue("2");
		List<WebElement> ele = ref.getOptions();
		Set<WebElement> refSet = new HashSet<WebElement>(ele);
		System.out.println("List are "+ele);
		for(WebElement elem : refSet) {
			System.out.println("WebElements under dropdown are "+elem);
			//refSet.add(elem);
		}
		try {
			
		}catch(Exception e) {
			
		}
		finally {
			driver.quit();
			}
	}
	

}
